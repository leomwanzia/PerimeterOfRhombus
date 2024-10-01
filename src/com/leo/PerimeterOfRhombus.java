package com.leo;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user to enter the side length of the rhombus
        System.out.print("Enter the side length of the rhombus: ");
        double length = in.nextDouble(); // reads the input as double

        // call the calculatePerimeter method to compute the perimeter
        double perimeter = calculatePerimeter(length);
        // print the calculated perimeter
        System.out.println("The perimeter of the rhombus is: " + perimeter);

        in.close();
    }

    //define the calculatePerimeter method
    private static double calculatePerimeter (double length) {
        // formula for perimeter = 4 * length
        double perimeter = 4 * length;

        return perimeter;
    }
}
