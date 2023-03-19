import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num, originalNum, remainder, result = 0, n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:"16);
        num = scanner.nextInt();
        originalNum = num;
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
