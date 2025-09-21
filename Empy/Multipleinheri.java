public class Multipleinheri {
    public static void main(String[] args) {
        int a=10;

        try {
            System.out.println(a/0);
        } 
        catch(ArithmeticException e){
            System.out.println("A");


        }
        catch(NullPointerException e){
            System.out.println("Null");

        }
        
        catch (Exception e) {
            System.out.println("all");

        }
    }
    
}
