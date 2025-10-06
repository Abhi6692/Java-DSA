package generalProgramming;

public class LeapYearChecker_8 {

    public static void checkLeapYear(int year) {
        // A leap year is divisible by 4 but not by 100,
        // unless it is also divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

    public static void main(String[] args) {
        checkLeapYear(2024);  // Change the year here to test other years
        checkLeapYear(2041);  // Example test
    }
}

