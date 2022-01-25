package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    //
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven:");
        double miles = input.nextInt();
        System.out.println("Enter the amount of gas consumed in gallons:");
        double gas = input.nextInt();
        double mpg = (miles/gas);
        System.out.println("The miles-per-gallon is:"+mpg);

    }
}