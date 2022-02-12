package init;

import aspirants.Aspirant;
import students.Student;

public class Run {

    public static void main(String[] args) {
        Student student1 = new Student (4.5);
        Student student2 = new Student(5.6);
        Student aspirant = new Aspirant(5.0);
        Student aspirant2 = new Aspirant(4.7);
        Student[] students = new Student[]{student1, student2, aspirant, aspirant2};

        for (Student s : students
             ) {
            System.out.println(s.getScholarship());
        }

    }

}
