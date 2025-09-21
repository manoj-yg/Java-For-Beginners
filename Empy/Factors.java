public class Factors {
    public static void main(String[] args) {
        int number=372;
        int factorCount=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0){
                factorCount++;
            }
        }
        if(factorCount==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("not the prime");
        }
    }
    
}
