public class CelsiusFahrenheit {
    public static void main (String args[])
    {
        System.out.println("This program is going to convert Celsius degree to Fahrenheit degree");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me Celsius degree: ");
        double a = scanner.nextDouble();

        double b = a * 1.8 + 32;

        System.out.println("It is " + b + " Fahtenheit degree");
    }
}
