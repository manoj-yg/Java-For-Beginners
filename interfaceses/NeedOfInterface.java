interface  Computer{
void code();
}


class Laptop implements Computer{
    @Override
    public void code(){
        System.out.println("Code,compile,run");
    }
}

class Desktop implements Computer{
    @Override
    public void code(){
        System.out.println("Code,compile,run: faster");
    }

}


class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}


public class NeedOfInterface {
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new Desktop();

        Developer person=new Developer();
        person.devApp(desk);
        person.devApp(lap);
        
    }
    
}
