import org.junit.Assert;
import org.junit.Test;
import peoplecomp.Student;

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
}
