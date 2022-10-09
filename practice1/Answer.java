import java.util.Scanner;

public class Answer {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Guide for exam");
        System.out.println("  ");

        //celsius to fahrenheit
        System.out.print("Enter temperature in celsius: ");
        float Celsius = scan.nextFloat();
        float Fahrenheit = toFahrenheit(Celsius);
        System.out.println(Celsius + "°C is equal to " + Fahrenheit + "°F");
        System.out.println("  ");

        //fahrenheit to celsius (NO VARIABLE)
        System.out.print("Enter temperature in fahrenheit: ");
        Fahrenheit = scan.nextFloat();
        Celsius = toCelsius(Fahrenheit);
        System.out.println(Fahrenheit + "°F is equal to " + Celsius + "°C");
        System.out.println("  ");

        //seconds to minutes
        System.out.print("Enter time in seconds: ");
        int seconds = scan.nextInt();
        int minutes = toMinutes(seconds);
        System.out.println(seconds + " seconds is equal to " + minutes + " minute/s ");

        scan.close();
}

static float toFahrenheit(float temperature) {
    return (temperature * 9 / 5) + 32;
}

static float toCelsius(float temperature) {
    return (temperature - 32) * 5/9;
}

static int toMinutes(int seconds) {
    return (seconds / 60);
}
}
