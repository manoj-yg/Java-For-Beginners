class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hello");
        }
    
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hi");
        }
}
}

// every thread has the run method


public class Thread_01 {
    public static void main(String[] args){
        // DIVIDE THE TASK INTO MULTIPLE THREADS
        A obj1=new A();
        B obj2=new B();

        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();

    }
}
