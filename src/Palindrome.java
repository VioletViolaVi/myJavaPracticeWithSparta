public class Palindrome {
    public void paliChecker(String item) {
        // empty variable needed
        String reversedItem = "";

        // replace spaces with no spaces
        if (item.contains(" ")){
            item = item.replace(" ", "");
        }

        // reverses string 1 char @ a time
        for (int i = item.length() - 1; i >= 0; i--) {
            reversedItem += item.charAt(i);
        }

        // compare word w/ reversed
        if (reversedItem.equals(item)) {
            System.out.println(item + " is a Palindrome! Reversed: " + reversedItem);
        } else {
            System.out.println(item + " is NOT a Palindrome! Reversed: " + reversedItem);
        }
    }
}
