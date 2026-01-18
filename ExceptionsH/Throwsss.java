class A{
    public void show() throws ClassNotFoundException{
            Class.forName("Throwss");
    }
}



public class Throwsss {
    static{
        System.out.println("Class Loader");
    }
    public static void main(String[] args) {
        A obj=new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
