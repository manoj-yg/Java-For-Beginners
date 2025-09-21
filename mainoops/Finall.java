// final keyword--->can be used with the variable,method and class

// final class -- > no one can extend this class no inheritance applied if we use final class
class Calc {

    public void show() {
        System.out.println("in Calc show");

    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// final method---->method overriding cannot able to do if use final keyword while writing method
class AdvCalc extends Calc {

    public void show() {
        System.out.println("in AdvCalc show");

    }
}

    public class Finall {

        public static void main(String[] args) {
            // final int num=8;
            // if we use final keyword in assigning variable then the variable become constant
            // System.out.println(num);
            AdvCalc obj = new AdvCalc();
            obj.show();
            obj.add(10, 20);

        }

    }
