import java.util.*;
public class input {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // String input =sc.next();
        // System.out.println(input);
        //.in means taking input out is for output

        // Scanner is the class used to input from the  user

        // String name=sc.nextLine();
        // System.out.println(name);
        
        int balance=sc.nextInt();
        System.out.println("Balance amount "+balance);
        int depo=sc.nextInt();
        System.out.println("Deposit amount " +depo);
        balance+=depo;
        System.out.println("Total Balance "+balance);

    }
}