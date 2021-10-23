import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //how many users we want to add
        //create N num of new students

        System.out.println("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        //create array of objects
        Student[] students = new Student[numOfStudents];
        for(int i = 0; i<numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }

    }
}
