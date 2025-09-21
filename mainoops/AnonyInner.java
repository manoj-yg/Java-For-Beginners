
class A {

    public void show() {
        System.out.println("In A show");
    }
}

public class AnonyInner {

    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In New show");
            }
        };
        obj.show();
    }
}
