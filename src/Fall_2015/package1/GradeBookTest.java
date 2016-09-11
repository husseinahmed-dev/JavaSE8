package Fall_2015.package1;
import java.util.Scanner;
/**
 * Created by Hussein on 5/27/15.
 */
public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String courseName = input.nextLine();
        System.out.print("Enter Instructor Name: ");
        String instructor = input.nextLine();
        System.out.print("How many Students you want: ");
        int studentNumber = input.nextInt();
        System.out.print("How many grades per student to enter: ");
        int gradeNumber = input.nextInt();
        int[][] grades = new int[studentNumber][gradeNumber];

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Enter Student %d Grades%n", i+1);
            for (int j = 0; j < grades[i].length; j++) {
                System.out.printf("Enter grade %d: ", j+1);
                int grade = input.nextInt();
                grades[i][j] = grade;
            }
        }
        GradeBook myGradeBook = new GradeBook(courseName, grades);

        System.out.printf("%n%n%nWelcome %s to the Grade Book of %s%n%n", instructor, myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
