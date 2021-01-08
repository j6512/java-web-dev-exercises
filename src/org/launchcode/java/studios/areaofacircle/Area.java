package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);






        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
            while(radius < 0) {
                System.out.print("Enter a radius: ");
                radius = input.nextDouble();
            }
            System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
        } else if (input.hasNext()) {
            System.out.println("This value is not a number.");
        } else {
            System.out.println("This is empty.");
        }
    }
}

