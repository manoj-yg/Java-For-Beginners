class Mobile
{
    String brand;
    int price;
    String network;
    static String name; // static variable called with the class name
    
    public Mobile(){
        brand="";
        price=200;
        System.out.println("In Construct");
    }
    static
    {
        name="Phone";  // Static variable calls ones
        System.out.println("In Static block");
    }


    public void show(){
        System.out.println(brand+" : "+price+" : "+network+": "+name);

    }
}


public class Construct {
    public static void main(String[] args)  throws ClassNotFoundException
    {

        Class.forName("Mobile");
        // Mobile obj1=new Mobile();
        // obj1.brand="Apple";
        // obj1.price=10000;
        // Mobile.name="SmartPhone";

        // Mobile obj2=new Mobile();
    }
    
}
