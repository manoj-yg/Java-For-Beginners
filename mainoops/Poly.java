


class A {

    public void show() {
        System.out.println("In A show");
    }

}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }

}

class C extends A {
    public void show() {
        System.out.println("In C show");
    }

}

public class Poly {

    public static void main(String[] args) {
        /*
         * polymorphism-->Many Behavior 
         * Two types---> compile time and Run Time
         * 
         * overloading is part of compile time
         * overriding is run time polymorphism
         */

        //  DYNAMIC METHOD DISPATCH
        //Polymorphism
        A obj = new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();

        

    }

}
