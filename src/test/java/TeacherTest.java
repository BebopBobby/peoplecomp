import org.junit.Assert;
import org.junit.Test;
import peoplecomp.Instructor;
import peoplecomp.Teacher;

public class TeacherTest {
    @Test
    public void teacherTest(){
        Instructor instructor = new Instructor(1, "Bill");
        Assert.assertTrue(instructor instanceof Teacher);
    }
}
