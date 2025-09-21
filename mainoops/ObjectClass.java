class Laptop{
    String model;
    int price;


    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    

}

/* different methods of the object class Object class is super class of all class
equals(Object obj)                        boolean
getClass()                                Class<?>
hashCode()                                int
notify()                                  void
notifyAll()                               void
toString()                                String
wait()                                    void
wait(long timeoutMillis)                  void
wait(long timeoutMillis, int nanos)       void
equals(Object obj)                        boolean
getClass()                                Class<?>
hashCode()                                int
 */

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1=new Laptop();
        obj1.model="MSI Modern";
        obj1.price=40000;

        Laptop obj2=new Laptop();
        obj2.model="MSI Modern";
        obj2.price=40000;

        boolean r=obj1.equals(obj2);
        System.out.println(r);
    }
    
}
