package lab7tasks;

public class Course {
    void calculateGrade(int assignments, int exams){
        System.out.println("Calculating cumulative Grades\nAssignments total = " + assignments + "\nExams total = " + exams + "\n");
    }
}

class ProgrammingCourse extends Course {
    @Override
    void calculateGrade(int assignments, int exams) {
        String grade;
        if ((assignments+exams) >= 150 && (assignments+exams) <= 200) {
            grade = "A";
        }else if ((assignments+exams) >= 100 && (assignments+exams) < 150) {
            grade = "B";
        }else if ((assignments+exams) >= 60 && (assignments+exams) < 100) {
            grade = "C";
        }else{
            grade = "U (Ungraded or Failed)";
        }
        System.out.println("Programming Grade: " + grade);
    }
}

class MathematicsCourse extends Course {
    @Override
    void calculateGrade(int assignments, int exams) {
        String grade;
        if ((assignments+exams) >= 180 && (assignments+exams) <= 200) {
            grade = "A";
        }else if ((assignments+exams) >= 120 && (assignments+exams) < 180) {
            grade = "B";
        }else if ((assignments+exams) >= 90 && (assignments+exams) < 120) {
            grade = "C";
        }else{
            grade = "U (Ungraded or Failed)";
        }
        System.out.println("Mathematics Grade: " + grade);
    }
}

class DesignCourse extends Course {
    @Override
    void calculateGrade(int assignments, int exams) {
        String grade;
        if ((assignments+exams) >= 130 && (assignments+exams) <= 200) {
            grade = "A";
        }else if ((assignments+exams) >= 110 && (assignments+exams) < 130) {
            grade = "B";
        }else if ((assignments+exams) >= 80 && (assignments+exams) < 110) {
            grade = "C";
        }else{
            grade = "U (Ungraded or Failed)";
        }
        System.out.println("Design Grade: " + grade);
    }
}

class main10{
    public static void main(String[] args) {
        Course pr = new ProgrammingCourse();
        Course math = new MathematicsCourse();
        Course design = new DesignCourse();

        pr.calculateGrade(60, 50);
        math.calculateGrade(60, 50);
        design.calculateGrade(60, 50);

    }
}

