
class Computer {

    public void playMusic() {
        // Access Specifier---->private, public,protected
        System.out.println("Music player: ");

    }

    public String getMePen(int cost) {
        if (cost >= 10) {
            return "PEN";
        }
        else{
            return "Nothing";
        }

    }

}

public class Demo2 {

    public static void main(String[] args) {
        // Creating a object for the above class
        Computer obj1 = new Computer();
        obj1.playMusic();
        String str = obj1.getMePen(11);
        System.out.println(str);

    }

}
