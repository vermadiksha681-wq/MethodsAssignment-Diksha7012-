/* Create a program to find the bonus of 10 employees based on their years of service as well as
 the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and 
 new salary. */
 import java.util.Random;
import java.util.Arrays;
public class EmployeeBonus {
    public static int[][] generateEmployees(int n) {
        int[][] employees = new int[n][2]; 
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int salary = 30000 + rand.nextInt(70000);
            int years = 1 + rand.nextInt(10);
            employees[i][0] = salary;
            employees[i][1] = years;
        }
        return employees;
    }

    public static double[][] calculateBonus(int[][] employees) {
        int n = employees.length;
        double[][] newData = new double[n][2];
        for (int i = 0; i < n; i++) {
            double salary = employees[i][0];
            int years = employees[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }
    public static void displayTotals(int[][] employees, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < employees.length; i++) {
            double oldSalary = employees[i][0];
            int years = employees[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%.2f\t\t%d\t%.2f\t%.2f\n", i + 1, oldSalary, years, bonus, newSalary);
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t%.2f\n", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] employees = generateEmployees(n);
        double[][] newData = calculateBonus(employees);
        displayTotals(employees, newData);
    }
}
