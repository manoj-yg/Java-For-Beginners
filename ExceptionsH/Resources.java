
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Resources {

    public static void main(String[] args) throws IOException {
        // int i=0;
        // int j=0;
        int num=0;
        try (BufferedReader  br=new BufferedReader(new InputStreamReader(System.in)))
        {
            // j=20/i;
            num=Integer.parseInt(br.readLine());
            System.out.println(num);


        }
        // catch(Exception e){
        //     System.out.println("something went wrong"+ e);

        // }
        // finally will execute irrespective of exception
        // where ever i want to close resource we use finally
        // finally block is used to close resource
        // finally {
        //     br.close();

        // }
    }

}
