package aspirants;

import students.Student;

public class Aspirant extends Student {


    private boolean scientificWork;

    public Aspirant(double averageMark) {
         super(averageMark);
    }


    @Override
    public int getScholarship() {
        double averageMark = getAverageMark();
        if (averageMark >= 5) {
            return 200;
        } else return 180;

    }
}
