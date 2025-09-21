class A extends Object{
     // This and super Methods in the java
     // important---->>>Every class in java extends the object class,, even you don't mention
    public A(){
        super();
        System.out.println("In A");

    }
    public A(int a){
        super();
        System.out.println("In A Int");
    }
}
    class B extends A{

        public B(){
            super();
            System.out.println("in B"); // super means call the constructor of the super class
        }
        public B(int n){
            // super(n);
            this();  // this method first call the same method constr and its default constr and its super class Constructors
            System.out.println("In B Int");

        }
    }

public class SuperAndThis {
    public static void main(String[] args) {
        // B obj= new B(5);
        
    }
    
}
