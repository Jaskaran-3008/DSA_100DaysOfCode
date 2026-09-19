// Q4 (User Inputs, Operations & Output)
// Write a program to calculate the area and circumference of a circle given its radius.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        // Display results
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        scanner.close();
    }
}