// Write a program to calculate various trigonometric functions using Math class given an angle in degrees.
import java.util.Scanner;
public class TrigonometricFunctions {
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        TrigonometricFunctions obj = new TrigonometricFunctions();
        double[] result = obj.calculateTrigonometricFunctions(angle);
        System.out.println("Sine(" + angle + ") = " + result[0]);
        System.out.println("Cosine(" + angle + ") = " + result[1]);
        System.out.println("Tangent(" + angle + ") = " + result[2]);

        sc.close();
    }
}

