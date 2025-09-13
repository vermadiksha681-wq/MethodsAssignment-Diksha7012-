// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
import java.util.Scanner;
public class CalculateSimpleInterest {
    Scanner sc = new Scanner(System.in);
    void calculate() {
        System.out.println("Enter principal");
        int Principal = sc.nextInt();
        System.out.println("Enter Rate");
        int Rate = sc.nextInt();
        System.out.println("Enter Time");
        int Time = sc.nextInt();
        int SimpleInterest = Principal * Rate * Time / 100;
        System.out.println("Simple interest is " + SimpleInterest + "  for principal " + Principal  + "  for Rate  "+ Rate  + " " + Time + "  for  Time ");

    }
    public static void main(String args[]){
        CalculateSimpleInterest obj = new CalculateSimpleInterest();
        obj.calculate();
    }
}