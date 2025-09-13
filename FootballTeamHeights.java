// Create a program to find the shortest, tallest, and mean height of players present in a football team.
import java.util.Random;
public class FootballTeamHeights {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static double findMean(int[] arr) {
        int sum = findSum(arr);
        return (double) sum / arr.length;
    }
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];
        System.out.println("Heights of players (in cm): ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; 
            System.out.print(heights[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", findMean(heights));
    }
}

