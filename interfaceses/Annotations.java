
class A{
    public void show(){
        System.out.println("in A Show");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("in b Show");
    }
}
// @MXBean
// @Generated

public class Annotations {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
    
}
