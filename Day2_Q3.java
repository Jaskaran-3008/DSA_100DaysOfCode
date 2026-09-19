// Q3 (User Inputs, Operations & Output)
// Write a program to calculate the area and perimeter of a rectangle given its length and breadth.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for length and breadth
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area and perimeter
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        // Display results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}



