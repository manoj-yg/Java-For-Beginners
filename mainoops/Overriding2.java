class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
// in Method overriding two classes have same method and also same parameters but we just need to add something to child class to see the difference between, methods in parent class and ,methods in child class

class AdvCalc extends Calc {
    @Override
    public int add(int n1, int n2) {
        return n1 + n2 +20;
    }

    public int modulo(int n1, int n2) {
        return n1 % n2;
    }
}

public class Overriding2 {

    public static void main(String[] args) {
        AdvCalc calci = new AdvCalc();
        int result = calci.add(10, 20);
        System.out.println("sum of two Numbers is " + result);
        int result2 = calci.modulo(20, 3);
        System.out.println("Modulus of two Numbers is: " + result2);
    }

}
