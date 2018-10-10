import org.junit.Assert;
import org.junit.Test;
import peoplecomp.Learner;
import peoplecomp.Student;

public class LearnerTest {
    @Test
    public void learnerTest(){
        Student student = new Student(1, 10, "uhhhh");
        Assert.assertTrue(student instanceof Learner);
    }
}
