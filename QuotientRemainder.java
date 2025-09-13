// Write a program to take 2 numbers and print their quotient and reminder.
import java.util.Scanner;
public class QuotientRemainder {
   public static int[] findRemainderAndQuotient(int number, int divisor) {
        int Quotient = number/divisor;
        int remainder = number%divisor;
        return new int[] {Quotient,remainder};
    }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 2 numbers");
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int[] result = findRemainderAndQuotient(num1,num2);
       System.out.println("Quotient" +result[0]);
       System.out.println("Reminder" +result[1]);
       sc.close();
    }
}
