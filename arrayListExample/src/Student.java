public class Student {

    String stdWnumber;
    double firstAssignment;
    double secondAssignment;

    //Constructor
    public Student(String stdWnumber, double firstAssignment, double secondAssignment){
        this.stdWnumber = stdWnumber;
        this.firstAssignment = firstAssignment;
        this.secondAssignment = secondAssignment;
    }

    //Methods
    public void stdReport(){
        System.out.println(this.stdWnumber);
        System.out.println(this.firstAssignment);
        System.out.println(this.secondAssignment);
    }
}
