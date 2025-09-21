
abstract class Car {

    /*
     *  Abstract Keyword
     *  we can have abstract method only in the abstract class
     *  declaring of the methods using abstract key word
     *  if we use curly brackets after writing method then it is called defining the method
     *  if we use ; this semicolon then declaring method
     * 
     * !!!! we can't create the object of abstract class --->IMP
     */

    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Play Musics");
    }
}

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("driving......");
    }
   

}

class UpdatedWagonR extends WagonR{  // concrete class 
     public void fly() {
        System.out.println("flying......");
    }

}

public class Abstracts {

    public static void main(String[] args) {
        Car obj = new UpdatedWagonR(); // we can create object of concrete class 
        obj.drive();
        obj.fly();
        obj.playMusic();

    }

}
