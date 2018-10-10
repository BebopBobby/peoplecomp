import org.junit.Assert;
import org.junit.Test;
import peoplecomp.People;
import peoplecomp.Person;
import java.util.ArrayList;

public class PeopleTest {
    People people = new People();
    Person person = new Person(2, "Bob");
    Person person2 = new Person(1, "Bill");

    @Test
    public void addTest(){
        people.add(person);
        Assert.assertEquals(1, people.getCount());
    }

    @Test
    public void findByIdTest(){
        people.add(person);
        people.add(person2);
        Assert.assertNotSame(person, person2);
    }

    @Test
    public void removeTest(){
        people.add(person);
        people.add(person2);
        people.remove(person);
        Assert.assertEquals(1, people.getCount());
    }

    @Test
    public void getCountTest(){
        Assert.assertEquals(0, people.getCount());
    }

    @Test
    public void getArrayTest(){
        people.add(person);
        Assert.assertEquals("[Person{" + "id=" + person.getId() + ", name='" + person.getName() + '\'' + "}]", people.getArray());
    }

    @Test
    public void removeAllTest(){
        people.add(person);
        people.add(person2);
        people.removeAll();
        Assert.assertEquals(0, people.getCount());
    }
}
