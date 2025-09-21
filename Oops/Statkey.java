class Mobile
{
    String brand;
    int price;
    String network;
    static String name; // static variable called with the class name

    public void show(){
        System.out.println(brand+" : "+price+" : "+network+": "+name);

    }
}

public class Statkey
{
    
    public static void main(String[] args)
    {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=10000;
        Mobile.name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=2000;
        Mobile.name="SmartPhone";

        Mobile.name="phone";

        obj1.show();
        obj2.show();

    }
}
