public class Replacing {

    public void replacingStrings(String word, String replaceOld, String replaceNew) {
        String newWord = word.replace(replaceOld, replaceNew);
        System.out.println("Old word: " + word + " New Word: " + newWord);
    }

    public void replacingChars(String word, char oldLetter, char newLetter) {
        String newWord = word.replace(oldLetter, newLetter);
        System.out.println(newWord);
    }
}
