/* An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the
 team of 10 members. For this create a program to find the BMI and display the height, weight, BMI 
 and status of each individual */
import java.util.Scanner;
public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; 
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }
        calculateBMI(persons);
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            double bmi = persons[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", persons[i][1], persons[i][0], bmi, status);
        }

        sc.close();
    }
}
