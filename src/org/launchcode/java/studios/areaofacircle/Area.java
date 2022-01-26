package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float radius = input.nextFloat();
        double area = Circle.getArea(2.5);
        //double area = (3.14 * r * r);
        System.out.println("The area of the circle is:" + area);

    }
}