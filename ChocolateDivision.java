// Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates.
import java.util.Scanner;
public class ChocolateDivision {
    public static int[] findRemainderAndQuotient(int number, int divisor) 
   {
      int getchocolate = number/divisor;
      int remaining = number % divisor;
      return new int[] {getchocolate,remaining};
   }
   public static void main(String args[]) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of chocolates");
    int numofchocolates  = sc.nextInt();
    System.out.println("Enter number of childrens");
    int numofchilds  = sc.nextInt();
    int[] result =  findRemainderAndQuotient(numofchocolates,numofchilds);
    System.out.println("number of chocolates each childreb get " + result[0]);
    System.out.println("number of remaining chocolates " + result[1]);
    sc.close();
   }
}
