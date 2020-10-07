import java.util.Arrays;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //        System.out.println(Arrays.toString(numbers));
        //It's important because printing numbers will just give you the reference ID

        //Fer's example to create an array of objects

        Person[] persons = new Person[3]; //accessing Person.class

                persons[0] = new Person("Caleb");
                persons[1] = new Person("Bradley");
                persons[2] = new Person("Gregg");

                persons = addPerson(persons, new Person("Cameron"));
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }

    public static Person[] addPerson(Person[] persons, Person person) {
        Person[] copiedPersons = Arrays.copyOf(persons, persons.length + 1);
        copiedPersons[persons.length] = person;
        return copiedPersons;
    }

}

