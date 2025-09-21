public class java {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest element found.");
        } else {
            System.out.println("The second highest number is: " + second);
        }
    }
}