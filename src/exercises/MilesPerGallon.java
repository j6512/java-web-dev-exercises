package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of miles driven: ");
        double miles = input.nextDouble();
        System.out.print("Enter amount of gas consumed: ");
        double gas = input.nextDouble();

        System.out.println("Your MPG is " + (miles / gas));


    }
}
