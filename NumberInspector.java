/* Write a program to take user input for 5 numbers and check whether a number is positive or negative.
 Further for positive numbers check if the number is even or odd. Finally compare the first and last elements 
 of the array and display if they are equal, greater, or less */
import java.util.Scanner;
public class NumberInspector {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of first and last element: ");
        if (result == 1) {
            System.out.println(numbers[0] + " is greater than " + numbers[numbers.length - 1]);
        } else if (result == 0) {
            System.out.println(numbers[0] + " is equal to " + numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " is less than " + numbers[numbers.length - 1]);
        }

        sc.close();
    }
}
