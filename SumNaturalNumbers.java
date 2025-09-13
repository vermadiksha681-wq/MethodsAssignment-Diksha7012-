// Write a program to find the sum of n natural numbers using loop.
import java.util.Scanner;
public class SumNaturalNumbers {
    Scanner sc = new Scanner(System.in);
    void  findSum()
    {
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        if (n>0) {
          int sum = 0;
          for (int i=0;i<=n;i++)
          {
            sum= sum+i;
          }
          System.out.println("sum of natural number " +sum);
          }
        else {
             System.out.println("number is not natural number");
        }
    }
    public static void main(String args[])
    {
        SumNaturalNumbers obj = new SumNaturalNumbers();
        obj.findSum();
    }
}