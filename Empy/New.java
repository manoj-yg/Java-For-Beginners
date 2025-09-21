
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;
        for (int i = number; i >0; i = i / 10) {
            int rem = i % 10;
            sum = (sum*10)+ rem;
            System.out.println(sum);

            //Total number of digits in number
        }
        if (original == sum) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
