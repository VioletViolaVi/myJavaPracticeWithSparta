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
        pali.paliChecker("race car"); // palindrome

        // replacing
        Replacing replacing = new Replacing();
        replacing.replacingStrings("laptop", "top", "bottom");

        replacing.replacingChars("rainbow", 'r', 't'); // tainbow
        replacing.replacingChars("rainbow", 'w', 'x'); // rainbox

        // enums
        Enums enums = new Enums();
        enums.enumsPractice(7); // SUN
        enums.enumsPractice(5); // FRI
        enums.enumsPractice(22); // default value

        // abstraction - abstract classes need to be used via a subclass!
        Dessert cake = new Cake();
        cake.messageAboutAbstract();
        cake.veganOrNot("no");
        cake.veganOrNot("yes");
        cake.veganOrNot("i don't know");
        cake.numOfOrders(3);
        cake.nameOfCustomer("Peter", "Pan");
        cake.messageAboutInterface();

        // abstract w/ animals
        System.out.println("\n");
        Pig pig = new Pig();
        pig.whatDoesItSay("Pig", "Oink Oink");
        pig.howManyLegs("Pig");
        pig.toesSentence("Pig", pig.hasToes("nO"));
        pig.waterOrLandHome("Pigs");
        System.out.println(pig.landOrWater("land"));

        System.out.println("\n");
        Cow cow = new Cow();
        cow.whatDoesItSay("Cow", "Moo Moo");
        cow.howManyLegs("Cow");
        cow.toesSentence("Cows", cow.hasToes("yES"));
        cow.waterOrLandHome("Cows");
        System.out.println(cow.landOrWater("farm"));

        System.out.println("\n");
        Fish fish = new Fish();
        fish.whatDoesItSay("Fish", "Glub, Glub!");
        fish.howManyFins("Fish", 5);
        fish.waterOrLandHome("Fish");
        System.out.println(fish.landOrWater("water"));
    }
}
