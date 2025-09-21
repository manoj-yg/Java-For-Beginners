public class TypeConversion {
    public static void main(String[] args) {
        /*
         * a]type compatible 
         * b] destination type> source type 
         * 
         * In java wer cant able to store the big byte datatype in the lower byte datatype
         * for example we can't store the long datatype in int datatype but 
         * we can store int in long 
         * long =8byte
         * int = 4 byte
         * Order of byte capacity
         * byte->short->int->float->long->double        this is order we can store the data 1st to last 
         */

         /*
          * Type casting
          long a =(int) 34;
          */
        //   long a=23;
        //   int b= (int)a;
        //   System.out.println(b);
        char ch='z';   // A to Z (65 to 90)
        // a to z (97 to 122)
        int number =ch;
        System.out.println(number);

        /*type casting 
         * up casting and down casting
         * 
         */
        double d=4.5;
        int i=(int) d;
        System.out.println(i);


    }
    
}

