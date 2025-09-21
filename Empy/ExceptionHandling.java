public class ExceptionHandling{
    public static void main(String[] args) {
        int a=10;
        try {
            System.out.println(a/0);
        try{
            System.out.println(a/0);

        }catch(Exception e){
            System.out.println("Inner Catch");


        }
        }
         catch (Exception e) {
            System.out.println("outer catch ");
        }
    }
}