package grades;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student caleb = new Student("Caleb");
        Student sahara = new Student("Sahara");
        Student cruzanio = new Student("Cruzanio");
        Student cory = new Student("Cory");

        caleb.addGrade(89); caleb.addGrade(82); caleb.addGrade(92);
        sahara.addGrade(94); sahara.addGrade(81); sahara.addGrade(86);
        cruzanio.addGrade(96); cruzanio.addGrade(93); cruzanio.addGrade(90);
        cory.addGrade(88); cory.addGrade(99); cory.addGrade(93);

        students.put("CalebEWheeler", caleb);
        students.put("saharatijol", sahara);
        students.put("cruzaniovillarreal", cruzanio);
        students.put("coryholley", cory);

        System.out.println(caleb.getName());

//        System.out.println("Welcome!");
//        System.out.println("Here are the Github usernames of out students: ");
//        for (String username : students.get(student1))
//        System.out.printf("|%s|  ", username);
    }
    

}
