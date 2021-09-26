public class Cow extends Animal implements Legs, HomeType {
    public void whatDoesItSay(String animal, String noise){
        System.out.println(animal + " says: " + noise);
    }

    public void howManyLegs(String animal){
        System.out.println(animal + "s have 4 legs.");
    }

    public boolean hasToes(String answer){
        if (answer.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public void waterOrLandHome(String home){
        System.out.println(home + " live on land");
    }
}
