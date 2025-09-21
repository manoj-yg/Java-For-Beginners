class Human{
    public int show(int n1,int n2){
        return n1+n2;

    }

}




public class ObjOreiented {
    public static void main(String[] args) {
        Human obj=new Human();
        int r=obj.show(2,6);
        System.out.println(r);
        //instance of class is object and class is blueprint of object
        // new keyword is used to store the object reference in the heap memory
        
    }
    
}
