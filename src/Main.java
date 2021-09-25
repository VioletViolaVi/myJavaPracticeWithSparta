public class Main {
    public static void main(String[] args) {
        // factorial
        Factorial facto = new Factorial();
        System.out.println(facto.factorial(6));

        // fibonacci
        Fibonacci fibo = new Fibonacci();
        System.out.println(fibo.fibonacci(3));

        // compareTo
        String string1 = "happy";
        String string2 = "ha";
        System.out.println(string1.compareTo(string2));

        // palindrome
        Palindrome pali = new Palindrome();
        pali.paliChecker("hello there is a string !"); // not palindrome
        pali.paliChecker("nurses run"); // palindrome
        pali.paliChecker("mom"); // palindrome
        pali.paliChecker("candy man"); // not palindrome

        // replacing
        Replacing replacing = new Replacing();
        replacing.replacingStrings("laptop", "top", "bottom");

        replacing.replacingChars("rainbow", 'r', 't'); // tainbow
        replacing.replacingChars("rainbow", 'w', 'x'); // rainbox
    }
}
