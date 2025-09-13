// Create a program to find the maximum number of handshakes among N number of students.
import java.util.Scanner;
public class Maxhandshakes {
    Scanner sc = new Scanner(System.in);
    void student() 
    {
        System.out.println("Enter a number of student");
        int n = sc.nextInt();
        int combination = (n * (n - 1)) / 2;
        System.out.println("Number of handshakes "+combination);
    }
    public static void main(String args[]) {
        Maxhandshakes obj = new Maxhandshakes();
        obj.student();
    }
}

