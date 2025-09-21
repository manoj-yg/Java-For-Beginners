class Mobile
{
    String brand;   // instance variable
    int price;        // instance variable
    static String name; // static variable called with the class name

    public void show(){
        System.out.println(brand+" : "+price+": "+name);

    }

    // Static Methods 
    public static void show1(Mobile obj){
        System.out.println(obj.brand+" : "+obj.price+": "+name);
        // We cannot directly use non static variables in static method 
        //We can only use directly static variable in static method
    }
}


public class staticMethod {
    public static void main(String[] args) {
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

        Mobile.show1(obj1);
        // We can call static method using class name ,,
        // no need  to create object
        // here show1() is static method but show() is just only method

    }
    
}
