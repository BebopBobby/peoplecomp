import junit.framework.Assert;
import org.junit.Test;
import peoplecomp.Instructor;
import peoplecomp.Student;
import peoplecomp.Teacher;

public class InstructorTest {
    Instructor instructor = new Instructor(200000, "Bob");
    Student student1 = new Student(200, 6, "uhhhhh");
    Student student2 = new Student(300, 1, "bluh");
    Student[] students = {student1, student2};

    @Test
    public void teachTest(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void lectureTest(){
        Assert.assertTrue(instructor instanceof Teacher);
    }
}
