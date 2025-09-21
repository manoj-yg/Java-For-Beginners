//class--class-->extends
//class--interface-->implements
//Interface--interface--->extends
interface A {

    // all methods in interface are public abstract
    // all variable are in interface by default final and static
    //interface not have own memory in the heap
    // in interface another class can implements multiple interface
    // int age = 20;
    // String area = "Bengaluru";

    void show();

    void config();
}

interface X {

    void run();

}
//inheritance also allow in interface
interface Y extends X{

}

class B implements A, Y {

    @Override
    public void show() {
        System.out.println("In A show");
    }

    @Override
    public void config() {
        System.out.println("In config ");
    }

    @Override
    public void run() {
        System.out.println("In config ");
    }

}

public class Interface {

    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        // System.out.println(A.area);
        // System.out.println(A.age);

    }

}
