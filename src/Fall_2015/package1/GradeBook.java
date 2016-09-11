package Fall_2015.package1;

/**
 * Created by Hussein on 5/27/15.
 */
public class GradeBook {
    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("              ");

        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println("Average");

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student])
                System.out.printf("%8d", test);

            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }

    public int getMaximum() {
        int max;
        max = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (max < grade) max = grade;
            }
        }
        return max;
    }

    public int getMinimum() {
        int min;
        min = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (min > grade) min = grade;
            }
        }
        return min;
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int element : setOfGrades) {
            total += element;
        }
        return (double) total / setOfGrades.length;
    }

    public void outputBarChart() {
        System.out.println("Grade Distribution:");
        int[] frequency = new int[11];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                ++frequency[grade / 10];
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) System.out.printf("%5d: ", 100);
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int j = 0; j < frequency[i]; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public void processGrades() {
        outputGrades();
        //System.out.printf("%nClass Average is %.2f", getAverage());
        System.out.printf("%nLowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());
        outputBarChart();
    }
}
