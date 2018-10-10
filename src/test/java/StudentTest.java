import org.junit.Assert;
import org.junit.Test;
import peoplecomp.Learner;
import peoplecomp.Student;
import peoplecomp.Person;

public class StudentTest {
    @Test
    public void learn(){
        Student student = new Student(20, 40, "Bob");

        double expected = 20;

        double actual = student.learn(20);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getTotalStudyTimeTest(){
        Student student = new Student(20, 40, "Bob");

        double expected = 40;

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(20, 40, "Bill");
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void learnerTest(){
        Student student = new Student(1, 10, "uhhhh");
        Assert.assertTrue(student instanceof Learner);
    }
}
