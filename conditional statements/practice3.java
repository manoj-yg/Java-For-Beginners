
public class practice3 {

    public static void main(String arg[]) {
        // loop -While,do while ,for loop

        // While Loop
        //Nested While loop
/*
int i=1;

while (i<=4) {
    
System.out.println("Hello World "+i);
int j=1;
while(j<=3){
    System.out.println("hi "+j);
    j++;
}
i++;


}
System.out.println();


// Do While Loop
         */
        // int i = 1;

        // do {
        //     System.out.println("Hello World " + i);
        //     i++;

        // } while (i <= 4);

        // for Loop
        // Nested For Loop
        for(int i=1;i<=7;i++){
            System.out.println("Day " + i);
            for(int j=1;j<=9;j++){
                System.out.println("   "+(j+8)+"---"+(j+9));
            }
        }



    }
}
