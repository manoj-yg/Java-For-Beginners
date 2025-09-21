
@FunctionalInterface
interface A{
    int show(int i,int j);

}
// class B implements A{
//     public void show(){
//         System.out.println("IN B Show");

//     }
// }

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
    // A obj = (i) ->
    // {
    //     System.out.println("IN Show  "+i);
    // };
    //     obj.show(19);
    //      -> this is called lambda Expression
    A obj=(i,j)->i+j;
    int result=obj.show(10, 20);
    System.out.println(result);


    }
    
}
