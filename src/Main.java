
public class Main {
    public static void main(String[] args) {
        Parser p = new Parser();
        System.out.println(p.parse("aaabbb"));
        Parser p1 = new Parser();
        System.out.println(p1.parse("ab"));
        Parser p2 = new Parser();
        System.out.println(p2.parse("bbaa"));
    }
}