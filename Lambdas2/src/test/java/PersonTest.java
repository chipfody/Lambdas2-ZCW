import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonTest {

    Person testPerson = new Person ( "Peter Parker", LocalDate.of ( 1962, 5, 02 ), Person.Sex.MALE, "akaSpiderman@gmail.com" );

    @Test
    public void testPersonConstructor() {
        String expected = "Peter Parker";
        testPerson.setName ( "Peter Parker" );
        Assert.assertEquals ( expected, testPerson.getName () );
    }

    @Test
    public void testPersonConstructor2() {
        Person.Sex expected = Person.Sex.MALE;
        Person.Sex actual = testPerson.getGender ();
        Assert.assertEquals ( expected, actual );
    }

    @Test
    public void testPersonConstructor3() {
        LocalDate expected = LocalDate.of ( 1962, 5, 02 );
        LocalDate actual = testPerson.getBirthday ();
        Assert.assertEquals ( expected, actual );
    }

    @Test
    public void testPersonConstructor4() {
        String expected = "akaSpiderman@gmail.com";
        String actual = testPerson.getEmailAddress ();
        Assert.assertEquals ( expected, actual );
    }
}
