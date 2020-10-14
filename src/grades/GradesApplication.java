package grades;

import java.util.HashMap;

import util.Input;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student caleb = new Student("Caleb");
        Student sahara = new Student("Sahara");
        Student cruzanio = new Student("Cruzanio");
        Student cory = new Student("Cory");

        caleb.addGrade(89);
        caleb.addGrade(82);
        caleb.addGrade(92);
        sahara.addGrade(94);
        sahara.addGrade(81);
        sahara.addGrade(86);
        cruzanio.addGrade(96);
        cruzanio.addGrade(93);
        cruzanio.addGrade(90);
        cory.addGrade(88);
        cory.addGrade(99);
        cory.addGrade(93);

        students.put("CalebEWheeler", caleb);
        students.put("saharatijol", sahara);
        students.put("cruzaniovillarreal", cruzanio);
        students.put("coryholley", cory);

        cli(students);
    }

    public static void cli(HashMap<String, Student> students) {
        Input input = new Input();
        System.out.println("Welcome!\n" +
                "\nHere are the Github usernames of our students: \n");
        for (String ghUsername : students.keySet()) {
            System.out.print(ghUsername + " ");
        }
        do {

            System.out.println("\nWhat student would you like to see more information on?");
            String keyTyped = input.getString();

            if (students.containsKey(keyTyped)) {
                System.out.printf("Name: %s - Github Username: %s\n" +
                                "Current Average: %f\n",
                        students.get(keyTyped).getName(),
                        keyTyped,
                        students.get(keyTyped).getGradeAverage());
            } else {
                System.err.println("Sorry, no student found with the GitHub username of "
                        + keyTyped);
            }
        } while (input.yesNo("Would you like to see another student? Y/N"));

        System.out.println("Goodbye, and have a wonderful day!");
    }

}
