// An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete.
import java.util.Scanner;
public class AthleteRun {
    Scanner sc = new Scanner(System.in);
    void calculateRounds() {
        System.out.println("Enter  triangular park sides in meters");
         System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double distance = 5000;
        double rounds = distance / perimeter;
        System.out.println("The athlete must complete approximately " + Math.ceil(rounds) + " rounds to cover 5 km.");

        sc.close();
    }

    public static void main(String[] args) {
      AthleteRun obj = new  AthleteRun();
      obj.calculateRounds();
    }
}
        
