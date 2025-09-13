/* Write a program Euclidean distance between two points as well as the equation of the line using those two points. 
Use Math functions Math.pow() and Math.sqrt() */
import java.util.Scanner;
public class Geometry {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);  
        double b = y1 - m * x1;            
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        double[] line = lineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + line[0] + "x + " + line[1]);
        sc.close();
    }
}
