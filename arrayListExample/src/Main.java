import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList Example");

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> myStudents = new ArrayList<>();
//        ArrayList<Student> Prog1700 = new ArrayList<>();

        myStudents.add(new Student("w123456",66,88));
        System.out.println(myStudents.size());
        myStudents.add(new Student("w777777",99,88));
        System.out.println(myStudents.size());
        myStudents.add(new Student("w989898",33,55));
        System.out.println(myStudents.size());

        for (Student myCurrentStudent :myStudents) {
            myCurrentStudent.stdReport();
            System.out.println();
        }

        System.out.println("Using For loop");
        for (int i = 0; i < myStudents.size(); i++) {
            myStudents.get(i).stdReport();
        }
    }
}