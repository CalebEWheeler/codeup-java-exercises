package grades;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<String, Student>();
        Student student1 = new Student("Caleb");
        Student student2 = new Student("Sahara");
        Student student3 = new Student("Cruzanio");
        Student student4 = new Student("Cory");

        students.put("CalebEWheeler", student1);
        students.put("saharatijol", student2);
        students.put("cruzaniovillarreal", student3);
        students.put("coryholley", student4);

        student1.addGrade(89); student1.addGrade(82); student1.addGrade(92);
        student2.addGrade(94); student2.addGrade(81); student2.addGrade(86);
        student3.addGrade(96); student3.addGrade(93); student3.addGrade(90);
        student4.addGrade(88); student4.addGrade(99); student4.addGrade(93);


        System.out.println("\n" + students);
//        System.out.println(caleb.getGrades());
//        System.out.println(caleb.getGradeAverage());

//        System.out.println("Welcome!");
//        System.out.println("Here are the Github usernames of out students: ");
//        for (String username : students.get(student1))
//        System.out.printf("|%s|  ", username);
    }
}
