import java.lang.FunctionalInterface;

@FunctionalInterface
interface A{
    void show(int i);

}
// class B implements A{
//     public void show(){
//         System.out.println("IN B Show");

//     }
// }

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
    A obj = (i) ->
    {
        System.out.println("IN Show  "+i);
    };
        obj.show(19);
        //  -> this is called lambda Expression
    }
    
}
