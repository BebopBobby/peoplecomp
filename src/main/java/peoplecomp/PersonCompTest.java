package peoplecomp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PersonCompTest {
    public static void main(String[] args) {
        People person = new People();
        Person sumoZach = new Person(1, "zach");
        Person curlyFryDerian = new Person(2, "derian");
        Person ogBobbyJohnson = new Person(3, "bobby");

        ogBobbyJohnson.setName("Bob");

        System.out.println(ogBobbyJohnson.getName());

        person.add(ogBobbyJohnson);
        person.add(curlyFryDerian);
        person.add(sumoZach);

        System.out.println(person.getCount());

        person.remove(ogBobbyJohnson);

        System.out.println(person.getCount());

        person.findById(2);

        System.out.println(person.getCount());

        person.removeAll();

        System.out.println(person.getCount());

        Student student = new Student(4, 40, "bluh");

        System.out.println(student.getTotalStudyTime());

        Instructor instructor = new Instructor(5, "uh");

        Student student2 = new Student(6, 40, "aaaaa");

        Student student3 = new Student(7, 40, "bbbbb");

        Student[] studentArray = {student2, student3};

        instructor.lecture(studentArray, 40);
    }
}