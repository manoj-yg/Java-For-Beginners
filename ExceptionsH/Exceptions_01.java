

/*
 * Exceptions
 * Types of Error
 * compile time error--->syntax error
 * run time error--->
 * logical error--->bugs
 */
public class Exceptions_01 {

    public static void main(String[] args) {

        int i = 2;
        int j=0;
        int nums[]=new int[5];
        String str=null;
        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        } catch (ArithmeticException e) {
            System.out.println("something went wrong  \n"+e);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in limit");
        }

        catch(Exception e){
            System.out.println("something went wrong  "+e);

        }
        System.out.println(j);
        //Hierarchy of classes
        /*
         *  Object
         *  Throwable----> two types  ---> ERROR and  Exception
         *
         * 1. Error
         * ThreadsDeath
         * IOERROR
         * VirtualMachine Error
         *
         * 2. Exceptions
         * RuntimeExceptions-->Arthimetic,nullpointer,Arrayoutofbound ect--Unchecked Exceptions
         * SQLExceptions--->Checked
         * IOExceptions--->Checked
         */

    }

}
