


public class Inheri {
    public static void main(String[] args) {
        //Inheritance
        ScientificCalc obj1=new ScientificCalc();
        int result=obj1.add(2,3);
        int result2=obj1.sub(9,2);
        int result3=obj1.mul(2,3);
        int result4=obj1.div(8,4);
        double result5=obj1.power(2,3);
        System.out.println(result + "  "+result2);
        System.out.println(result3 + "  "+result4);
        System.out.println(result5);

        /*
         * calc<----AdvCalc<----ScienctificCalc
         * above is called Multi level inheritance
         * check Calc,AdvCalc,scientificCalc while studying buddy
         */
        /*
         * why Multiple inheritance is not possible in java?????
         * ans:-->because it cause ambiguity and complexity problem
         * Ex;If both class hav same method it is confused to choose so 
         * java uses interfaces to solve this problem
         */



    
    }
    
}
