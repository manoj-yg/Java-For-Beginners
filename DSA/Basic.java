
public class Basic {

    public static void main(String[] args) {
        /*1. Basic Star Patterns
----------------------
1. Print a solid rectangle of * of given rows and columns.
2. Print a hollow rectangle of * of given rows and columns.
3. Print a left-aligned right-angled triangle of stars.
4. Print a right-aligned right-angled triangle of stars.
5. Print an inverted left-aligned triangle of stars.
6. Print an inverted right-aligned triangle of stars.
7. Print a square pattern of stars. */

        for (int i = 0; i <=5; i++) {   //rows

            for (int j = 0; j <=4; j++) {  
                
                // columns
                if (i == 0 || i == 5|| j == 0 || j == 4){
                     System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 

    }

}
