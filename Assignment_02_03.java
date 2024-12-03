import java.util.*;

public class Assignment_02_03 {
    public static void main(String args[]) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter Any Integer Values?");
        String num = xyz.nextLine();

        // Reverse the string
        String reverse_num = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reverse_num += num.charAt(i);
        }
        System.out.println("Reversed number: " + reverse_num);

        // Convert the reversed string to integer
        int actual_num = Integer.parseInt(reverse_num);
        int temp = actual_num;

        // Loop through digits 0-9 to count frequency
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            while (actual_num != 0) {
                int rem = actual_num % 10; // Get the last digit
                if (rem == i) {
                    count++; // Increment count if the digit matches
                }
                actual_num /= 10; // Remove the last digit
            }
            if (count > 0) {
                System.out.println(i + ", frequency is: " + count);
            }
            actual_num = temp; // Restore actual_num for the next iteration
        }
    }
}
