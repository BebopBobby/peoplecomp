import peoplecomp.Person;
import junit.framework.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void getNameTest(){
        Person person = new Person(20000, "Bob");
        String expected = "Bob";

        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        Person person = new Person(20, "Bob");
        person.setName("Derian");
        String expected = "Derian";

        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest(){
        Person person = new Person(20, "Bob");

        long expected = 20;

        long actual = person.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest(){
        Person person = new Person(20, "Bob");

        String expected = "Person{" + "id=" + person.getId() + ", name='" + person.getName() + '\'' + '}';

        String actual = person.toString();

        Assert.assertEquals(expected, actual);
    }
}