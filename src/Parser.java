
//accepts words from the language L = {a^n b^n | n >= 0, n element of natural numbers}
public class Parser {
    String input;
    int position;

    //checks if input is accepted by the language and for that using all other methods
    boolean parse(String input0) {
        //adds to the input the Stack-symbol #, so the call match('#'); can return true
        input = input0 + "#";
        position = 0;
        return S() && match('#');
    }

    //recursive method?
    boolean S() {
        if (next() == 'a') return match('a') && S() && match('b');
        else return true;
    }

    //The match() method is called with different characters,
    // it checks if the next character in the input string is the same as the passed character
    // and if so, increments the position and returns true. If it's not the same, it returns false.
    boolean match(char c) {
        if (next() == c) {
            position++;
            return true;
        } else return false;
    }

    //The next() method returns the next character in the input string.
    char next() {
        return input.charAt(position);
    }
    //EXAMPLE 'ab':
    //The parse method will call the S() method, which will check if the next character is 'a' and call match('a'),
    //which will match 'a' and increment the position, then it will call S() again which will return true,
    //because there's no more 'a' in the input. Then it will call match('b') which will match 'b' and
    //increment the position. Finally, the parse method will call match('#') which will match
    //because of the added '#' in the beginning (in the parse method) and return true, so the parse method will return
    //true, indicating that the input string is accepted by the language.
}
