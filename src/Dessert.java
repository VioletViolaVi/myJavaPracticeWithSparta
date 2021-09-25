abstract class Dessert {

    public void messageAboutInterface(){
        System.out.println("Interface assumes everything here is abstract.");
        System.out.println("Therefore, everything here has not implementation i.e. curly braces w/ code in it.");
    }

    // not implemented here*
    public abstract void nameOfCustomer(String fName, String lName);

    public void numOfOrders(int num){
        System.out.println(num + " orders made!");
    }

    public void veganOrNot(String answer){
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("It's good for vegans!");
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("It's bad for vegans!");
        } else {
            System.out.println("Yes or No only!");
        }
    }

    public void messageAboutAbstract(){
        System.out.println("In order to see this, you need to use the subclass Cake");
    }
}
