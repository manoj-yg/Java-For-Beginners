public class swap {

    public static void main(String[] args) {
        int a = 1;
int b = 2;
int c = 3;

// Swapping in cyclic order
a = a + b + c; // a = 6
b = a - (b + c); // b = 6 - (2+3) = 1 (original a)
c = a - (b + c); // c = 6 - (1+3) = 2 (original b)
a = a - (b + c); // a = 6 - (1+2) = 3 (original c)

System.out.println("a = " + a + ", b = " + b + ", c = " + c);

    }

}
