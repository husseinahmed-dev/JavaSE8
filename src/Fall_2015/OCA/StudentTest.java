package Fall_2015.OCA;

/**
 * Created by Hussein on 11/7/15.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Jeff");
        Student student3 = new Student("James", 3.75);

        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName() + " " + student3.getGpa());

        System.out.print(student3.getName());
        if (student3.onPresidentList())
            System.out.println(" is on president list");
        else
            System.out.println(" isn't on president list");

        student3.addCourse("6");
        student3.addCourse("2");
        student3.addCourse("3");

        for (int i = 0; i < student3.getCourses().length; i++) {
            System.out.println(student3.getCourses()[i]);
        }

    }
}
