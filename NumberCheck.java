// Write a program to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class NumberCheck {
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   
        } else if (num < 0) {
            return -1; 
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int result = checkNumber(number);
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
        sc.close();
    }
}

