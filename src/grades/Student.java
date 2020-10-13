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
        double addedGrades = 0;
        for (double grade : grades) {
            addedGrades += grade;
        }
        return addedGrades / this.grades.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student std1 = new Student("Caleb");
        Student std2 = new Student("Bill");
        std1.addGrade(89);
        std1.addGrade(92);
        System.out.println(std1.getName() + "'s grades are: " + std1.grades.get(0) + ", " + std1.grades.get(1));
        std2.addGrade(95);
        std2.addGrade(87);
        System.out.println(std2.getName() + "'s grades are: " + std2.grades.get(0) + ", " + std2.grades.get(1));
        System.out.println(std1.getName() + "'s average grade is: " + std1.getGradeAverage());
        System.out.println(std2.getName() + "'s average grade is: " + std2.getGradeAverage());

    }
}
