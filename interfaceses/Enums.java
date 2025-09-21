
//status is class
enum Status{
    Running,Failed,Pending,Success;
}

//enum is class
public class Enums {
    public static void main(String[] args) {
        // Status[] ss=Status.values();
        // // System.out.println(ss[0]);

        // for(Status s:ss){
        //     System.out.println(s+"   : "+s.ordinal());
        // }

        // if(s==Status.Running){
        //     System.out.println("It's all good");
        // }
        // else if(s==Status.Failed){
        //     System.out.println("Try Again");
        // }
        // else if(s==Status.Pending){
        //     System.out.println("Please wait");
        // }
        // else{
        //     System.out.println("Done");
        // }
         Status s=Status.Running;
         System.out.println(s.getClass().getSuperclass());
       // ruled switch case
        switch (s) {
            case Running -> System.out.println("It's all good");
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Please wait");
            default -> System.out.println("Done");
        }
        
        
    }
    
}
