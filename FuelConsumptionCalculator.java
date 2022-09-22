import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelConsumptionCalculator {
    public static void calculateFuel(double ltr, double km) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double gallon = ltr * 0.2642;
        double mile = km * 0.6214;

        double literperkm = (ltr / km) * 100;
        double gallonperkm = mile / gallon;

       
        System.out.println(decimalFormat.format(literperkm));
        System.out.println("L/100KM");
        System.out.println(decimalFormat.format(gallonperkm));
        System.out.println("M/G");
    }

    public static void inputs(double value) {
        if (value <= 0) {
            System.out.println((int) value + " is an Invalid Input");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double liter = scanner.nextDouble();
        if (liter <= 0) {
            System.out.println((int) liter + " is an Invalid Input");
            System.exit(0);
        }
        System.out.println("Enter the distance covered");
        double km = scanner.nextDouble();
        if (km <= 0) {
            System.out.println((int) km + " is an Invalid Input");
            System.exit(0);
        }
        calculateFuel(liter, km);
    }
}