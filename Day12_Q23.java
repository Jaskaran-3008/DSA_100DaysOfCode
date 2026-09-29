// Q23 (Conditional Statements)
// Write a program to calculate library fine based on late days as follows: 
// First 5 days late: ₹2/day 
// Next 5 days late: ₹4/day 
// Next 20 days days late: ₹6/day 
// More than 30 days: Membership Cancelled.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days the book is late: ");
        int days = scanner.nextInt();
        double fine = 0;

        if (days <= 5) {
            fine = days * 2;
        } else if (days <= 10) {
            fine = 10 + (days - 5) * 4;
        } else if (days <= 30) {
            fine = 10 + 20 + (days - 10) * 6;
        } else {
            System.out.println("Membership Cancelled.");
            return;
        }

        System.out.println("Library fine: ₹" + fine);
    }
}