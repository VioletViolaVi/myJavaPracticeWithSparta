public class Enums {
    public void enumsPractice(int num){
        enum days{
            MON, TUES, WEDNES, THURS, FRI, SAT, SUN
        }

        switch (num) {
            case 1:
                System.out.println(days.MON);
                break;
            case 2:
                System.out.println(days.TUES);
                break;
            case 3:
                System.out.println(days.WEDNES);
                break;
            case 4:
                System.out.println(days.THURS);
                break;
            case 5:
                System.out.println(days.FRI);
                break;
            case 6:
                System.out.println(days.SAT);
                break;
            case 7:
                System.out.println(days.SUN);
                break;
            default:
                System.out.println("Pick a number between 1 and 7 inclusively only!");
        }
    }
}
