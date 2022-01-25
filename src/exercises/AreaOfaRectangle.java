package exercises;
import java.util.Scanner;

public class AreaOfaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("To find the area of a rectangle,enter the length:");
        double length = input.nextInt();
        System.out.println("enter the width:");
        double width = input.nextInt();
        double area = (length * width);
        System.out.println("The area of the rectangle is:" + area);
    }
}