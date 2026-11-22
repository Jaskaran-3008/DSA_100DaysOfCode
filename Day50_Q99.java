// Q99 (Strings)
// Change the date format from dd/04/yyyy to dd-Apr-yyyy.

import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date in the format dd/MM/yyyy: ");
        String dateInput = sc.nextLine();

        String formattedDate = formatDate(dateInput);
        System.out.println("The formatted date is: " + formattedDate);
    }

    public static String formatDate(String dateInput) {
        String[] parts = dateInput.split("/");
        if (parts.length != 3) {
            return "Invalid date format";
        }

        String day = parts[0];
        String month = getMonthName(parts[1]);
        String year = parts[2];

        return day + "-" + month + "-" + year;
    }

    public static String getMonthName(String monthNumber) {
        switch (monthNumber) {
            case "01": return "Jan";
            case "02": return "Feb";
            case "03": return "Mar";
            case "04": return "Apr";
            case "05": return "May";
            case "06": return "Jun";
            case "07": return "Jul";
            case "08": return "Aug";
            case "09": return "Sep";
            case "10": return "Oct";
            case "11": return "Nov";
            case "12": return "Dec";
            default: return "";
        }
    }
}