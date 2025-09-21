
import java.util.Scanner;

class Calci {
    int num=10; // instance Variable is the part of heap memory in the jvm

    public int addition(int a, int b) {
        int result = a + b;
        System.out.println(num);
        return result;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    public double addition(double a, double b) {
        return a + b;
    }

}

public class Demo3 {

    public static void main(String[] args) {

        // Method overloading
        /*
----->Rules for Method Overloading
#1 Methods must have same name.
#2 Parameter lists must be different.
#3 Methods can have different return types.
#4 Methods can have different access modifiers (public, private, etc.).
#5 Cannot overload by changing only the return type.

         */ Scanner sc = new Scanner(System.in);
        System.out.print("Enter The value Of n1: ");
        int n1 = sc.nextInt();
         System.out.print("Enter The value Of n2: ");
        int n2 = sc.nextInt();
         System.out.print("Enter The value Of n3: ");
        int n3 = sc.nextInt();
        Calci calc = new Calci();
        int add = calc.addition(n1, n2);
        System.out.println("The Sum of Two Numbers: " + add);
        System.out.println("The sum of three Numbers: " + calc.addition(n1, n2, n3));
        // System.out.println(calc.addition(20,30));

    }

}
