class Student{
    int rollno;
    String name;
    int marks;

}

public class Stringarray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Student stud1=new Student();
        stud1.rollno=1;
        stud1.name="Manoj";
        stud1.marks=90;

        Student stud2=new Student();

        stud2.rollno=2;
        stud2.name="Varun";
        stud2.marks=88;

        Student stud3=new Student();

        stud3.rollno=3;
        stud3.name="Shiva";
        stud3.marks=91;

        Student students[]=new Student[3];
        students[0]=stud1;
        students[1]=stud2;
        students[2]=stud3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name+" : "+students[i].marks+" : "+students[i].rollno);

        // }
        // Enhanced for loop==for Each loop

        for(Student studs:students){
            System.out.println(studs.name+": "+studs.marks+": "+studs.rollno);
        }


        
    }
}
