public abstract class Animal {
    public abstract void whatDoesItSay(String animal, String noise);

    public void toesSentence(String animal, boolean hasToesBoolean) {
        if (hasToesBoolean) {
            System.out.println(animal + " does have toes!");
        } else {
            System.out.println(animal + " does not have toes!");
        }
    }

    public String landOrWater(String home){
        if (home.equalsIgnoreCase("water")) {
            return "This animal is aquatic";
        } else if ((home.equalsIgnoreCase("land")) ){
            return "This animal is a land animal";
        }else {
            return "I don't know what type of animal this is!";
        }
    }
}
