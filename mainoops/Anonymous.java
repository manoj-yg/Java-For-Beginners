// Anonymous object concept
class A{

    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("In A show");
    }
}


public class Anonymous {
    public static void main(String[] args) {
        new A().show();
        // anonymous object ---we cannot reuse this type of object
        


        
    }
    
}
