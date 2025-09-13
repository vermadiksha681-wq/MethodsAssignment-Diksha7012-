/* Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers
 are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same*/
public class OTPGenerator {
    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000); 
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique ");
        } else {
            System.out.println("\nSome OTPs are repeated ");
        }
    }
}
