public class Fish extends Animal implements Fins, HomeType{
    public void whatDoesItSay(String animal, String noise){
        System.out.println(animal + " says: " + noise);
    }

    public void howManyFins(String animal, int finNum){
        System.out.println(animal + " has " + finNum + " fins!");
    }

    public void waterOrLandHome(String home){
        System.out.println(home + " live underwater");
    }
}
