class NewException extends Exception{
    public NewException(String string){
        super(string);
    }

}


public class Throww {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if(j==0){
                // throw new ArithmeticException("I don't Need zero");
                throw new NewException("I don't Need zero");
            }

        } catch (NewException e) {
            j=18/1;
            System.out.println("This is default output: "+e);

        } catch (Exception e) {
            System.out.println("something went wrong " + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
