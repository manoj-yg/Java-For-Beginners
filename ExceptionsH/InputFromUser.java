
import java.io.IOException;
import java.util.Scanner;

public class InputFromUser {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter The Number: ");
        //println is method of print stream Class
        //out is inside the  System class
        //out is object of PrintStream
        // try {
        //     num = System.in.read();  //it will give ASCII VALUE
        // } catch (IOException e) {
        // }

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();   //closing the resource

        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
    }

}
