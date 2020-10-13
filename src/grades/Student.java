package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.grades = new ArrayList<>();
        this.name = studentName;
    }
    public String getName() {return this.name;}

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        Integer addedGrades = 0;
        for (Integer grade : grades) {
            return addedGrades + grade;
        }
        return addedGrades;

    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student std1 = new Student("Caleb");
        Student std2 = new Student("Bill");
        std1.addGrade(89);
        std1.addGrade(92);
        System.out.println(std1.grades.get(0) + " " + std1.grades.get(1));
    }
}
