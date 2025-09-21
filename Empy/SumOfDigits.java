public class SumOfDigits {
    public static void main(String[] args) {
        int numbers=377;
        int original = numbers;
        int sum=0;
        while(numbers != 0){
            int rem = numbers % 10;
            sum = (sum*10) + rem;
            numbers = numbers / 10;
            System.out.println(sum);
        }
        if (original == sum) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

    }

}
