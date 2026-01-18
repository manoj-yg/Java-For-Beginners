import java.util.*;

public class Crc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of data bits: ");
        int dataBits = sc.nextInt();
        int[] data = new int[dataBits];
        System.out.print("Enter data bits: ");
        for (int i = 0; i < dataBits; i++) data[i] = sc.nextInt();

        System.out.print("Enter number of bits in divisor: ");
        int divBits = sc.nextInt();
        int[] divisor = new int[divBits];
        System.out.print("Enter divisor bits: ");
        for (int i = 0; i < divBits; i++) divisor[i] = sc.nextInt();

        int total = dataBits + divBits - 1;
        int[] dividend = new int[total];
        for (int i = 0; i < dataBits; i++) dividend[i] = data[i];

        System.out.print("\nDividend after appending zeros: ");
        printArray(dividend);

        int[] remainder = divide(dividend.clone(), divisor);
        int[] crcCode = new int[total];
        for (int i = 0; i < total; i++) crcCode[i] = dividend[i] ^ remainder[i];

        System.out.print("\nCRC code: ");
        printArray(crcCode);

        // Verification
        System.out.print("\nEnter received code (" + total + " bits): ");
        for (int i = 0; i < total; i++) crcCode[i] = sc.nextInt();

        remainder = divide(crcCode.clone(), divisor);

        boolean error = false;
        for (int bit : remainder)
            if (bit != 0) error = true;

        System.out.println(error ? "\nError detected in transmission!" : "\nNo error detected!");
        System.out.println("THANK YOU :)");
    }

    // Performs XOR division
    static int[] divide(int[] dividend, int[] divisor) {
        int cur = 0;
        while (cur <= dividend.length - divisor.length) {
            if (dividend[cur] == 1) {
                for (int i = 0; i < divisor.length; i++)
                    dividend[cur + i] ^= divisor[i];
            }
            cur++;
        }
        return dividend;
    }

    static void printArray(int[] arr) {
        for (int bit : arr) System.out.print(bit);
        System.out.println();
    }
}