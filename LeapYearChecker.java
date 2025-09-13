// Write a program that takes a year as input and outputs the Year is a Leap Year or not 
import java.util.Scanner;
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("Leap year calculation valid only for year >= 1582.");
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean leap = isLeapYear(year);
        if (leap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        sc.close();
    }
}
