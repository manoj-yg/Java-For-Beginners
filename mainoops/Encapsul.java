

class Human
{
    private int age;
    private String name;


    // learning constructor also in this file
    // Constructor name should same as the class name
    // constructor will never return anything
    // every new object is created it will call the constructor automatically
    // we can assign default value for the constructor
    public Human(){
        age=21;
        name="Manoj Y G";

    }
    
    public Human(int age,String name){  // parametrized constructor
        this.age=age;
        this.name=name;
    }

    public Human(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;

    }
    public void setAge(int age){
        this.age=age;    // this is a key word using the current object
    }
    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name=name;

    }
    // we can only access private instance variable inside that class only we can create the class of the different method inside the same class and the get the variable use of variable in other classes



}
public class Encapsul
{
    public static void main(String[] args)
    {
     Human obj=new Human();
     Human obj1=new Human(12);
    //  obj.setAge(20);
    //  obj.setName("Manoj");
    //  System.out.println(obj.name+" : "+obj.age);
    System.out.println(obj.getAge()+" : "+obj.getName());
    System.out.println(obj1.getAge()+" : "+obj1.getName());
    }
}
