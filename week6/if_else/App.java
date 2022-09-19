public class App {
    public static void main(String[] args) throws Exception {

        // Sequential Structure
        // Methods are called in order.
        boolean suspended = false;
        boolean holiday = false;
        
        if (holiday) {
            System.out.println("sleep");
        }
        else if (suspended) {
            System.out.println("Stay at home");
        } else {

        // Step 1
        rideTricycle();

        // Step 2
        rideJeep();

        // Step 3
        rideMRT();

        // Step 4
        rideLRT1();

        // Step 5
        rideLRT2();
        
        //Step 6
        walk();
    }
    }

    static void rideTricycle() {
        System.out.println("Ride tricycle along Magnolia Street");
        System.out.println("Exit jeep along Mercury Drug Store");
    }

    static void rideJeep() {
        System.out.println("Ride jeep along Mercury Drug Store");
        System.out.println("Exit jeep at Guadalupe");
    }

    static void rideMRT() {
        System.out.println("Ride MRT at Guadalupe");
        System.out.println("Exit at Taft Avenue");
    }

    static void rideLRT1() {
        System.out.println("Ride LRT1 at EDSA");
        System.out.println("Exit LRT1 at Doroteo Jose");
    }
    
    static void rideLRT2() {
        System.out.println("Ride LRT2 at Recto");
        System.out.println("Exit LRT2 at Legarda");
    }

    static void walk() {
        System.out.println("Walk for 3 mins");
    }
}

