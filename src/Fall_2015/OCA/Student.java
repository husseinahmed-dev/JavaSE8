package Fall_2015.OCA;

/**
 * Created by Hussein on 11/7/15.
 */
// static methods cannot refer to instance variables.

public class Student {
    private String name;
    private double gpa;
    private String[] courseIDs = new String[40];
    private int courseCounter;
    public static int studentCounter=0;

    public Student() {
        name = null;
        gpa = 0;
        studentCounter++;
    }

    public Student(String name) {
        this.name = name;
        studentCounter++;
    }

    public Student(double gpa) {
        this.gpa = gpa;
        studentCounter++;
    }

    public Student(String name, double gpa) {
        this(name);
        this.gpa = gpa;
        studentCounter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa <= 4.0 && gpa >= 0.0)
            this.gpa = gpa;
        else
            throw new IllegalArgumentException("Gpa not in range (0-4)");
    }

    public boolean onPresidentList() {
        if (gpa >= 3.7)
            return true;
        else
            return false;
    }

    public String[] getCourses() {
        String[] ids = new String[courseCounter];

        for (int i = 0; i < courseCounter; i++) {
            ids[i] = courseIDs[i];
        }

        return ids;
    }

    public void setCourseIDs(String[] courseIDs) {
        this.courseIDs = courseIDs;
    }

    public boolean addCourse(String course) {
        if (courseCounter < courseIDs.length) {
            courseIDs[courseCounter] = course;
            courseCounter++;
            return true;
        }

        return false;
    }
}
