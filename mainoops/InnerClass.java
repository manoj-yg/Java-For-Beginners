class A{
    int age;
    public void show(){
        System.out.println("IN A show");

    }

    static class B{
        public void config(){
            System.out.println(" in B config ");
        }

    }
}



// static can only be used in the inner class      
public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        // A.B obj1=obj.new B()  // if the class is non static
        A.B obj1=new A.B(); // for static class if inner class is static
        obj1.config();
        
    }
}
