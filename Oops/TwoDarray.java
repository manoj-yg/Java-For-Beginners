public class TwoDarray {
    public static void main(String[] args) {
        // 2D array
        int nums[][]= new int[4][];
        // jagged array---> Where the numbers of elements in each array may different
        // Means different number of elements in the columns
        // nums[0]= new int[3];
        // nums[1]= new int[2];
        // nums[2]= new int[4];
        // nums[3]= new int[3];

        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         nums[i][j]=(int)(Math.random()*10);
        //     }
        // }

        // Enhanced for loop in the java 
        for(int n[]:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();

//             Drawbacks:-
// - The memory allocation is contiguous.
// - The size of an array is fixed. Array size cannot be expand.
// - Searching takes time.
// - Array can store values of only same type. It can store homogeneous type value only.
        }
    }
}
