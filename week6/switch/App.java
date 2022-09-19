public class App {
    public static void main(String[] args) throws Exception {

        String today = "wednesday";

        switch (today) {
            case "monday":
                System.out.println("Go to school");
                break;
            case "tuesday":
                System.out.println("attend online class");
                break;
            case "wednesday":
                System.out.println("watch one piece");
                break;
            case "thursday":
                System.out.println("attend thursday class");
                break;
            case "friday":
                System.out.println("I go on a date during fridays!");
                break;
            case "Saturday":
                System.out.println("I go to the gym every saturday!");
                break;
            case "Sunday":
                System.out.println("I do my assignments every sunday!");
                break;
            default:
                break;
        }

    }
}
