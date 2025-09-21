enum Laptop{
    Macbook(2000),XPS(2010),MSI,Surface(1000);

    private int price;
    private Laptop(){
        price=100;
    }

    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class EnumsClass {
    public static void main(String[] args) {
        // Laptop lap=Laptop.Macbook;
        // System.out.println(lap+": "+lap.getPrice());

        Laptop lap[]=Laptop.values();

        for(Laptop laps:lap){
            System.out.println(laps+": "+laps.getPrice());

        }

        
    }
    
}
