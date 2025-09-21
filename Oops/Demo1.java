class Calculator{
    
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
}

public class Demo1 {
    public static void main(String arg[]){
        // Object Oriented Programming Concepts
        /*
         * Class and Object
         */
        int num1=4;
        int num2=5;

        // int result =num1+num2;
        
        // Create and use Calculator object
        Calculator calc = new Calculator();
        
        
        // here calc is reference variable
        int result=calc.add(num1,num2);
        System.out.println(result);
    }
}
