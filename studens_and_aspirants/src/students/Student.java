package students;

public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScholarship() {
        if (averageMark >= 5) {
            return 100;
        } else return 80;

    }
}
