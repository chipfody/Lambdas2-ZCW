import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {

    ArrayList<Person> testArray = new ArrayList<> ( 5 );

    @Before
    public void setUp() {
        Person testp1 = new Person ( "Ralph", LocalDate.of ( 1978, 10, 4 ), Person.Sex.MALE, "Ralph@gmail.com" );
        Person testp2 = new Person ( "Jeanine", LocalDate.of ( 2007, 2, 8 ), Person.Sex.FEMALE, "jeanine@yahoo.com" );
        Person testp3 = new Person ( "Archie", LocalDate.of ( 1954, 11, 5 ), Person.Sex.MALE, "archie@aol.com" );
        Person testp4 = new Person ( "Shirley", LocalDate.of ( 1975, 12, 31 ), Person.Sex.FEMALE, "gmomma@verizon.net" );
        Person testp5 = new Person ( "LaBrian", LocalDate.of ( 2001, 7, 11 ), Person.Sex.MALE, "LBwow@gmail.con" );
        testArray.add ( testp1 );
        testArray.add ( testp2 );
        testArray.add ( testp3 );
        testArray.add ( testp4 );
        testArray.add ( testp5 );
    }

    @Test
    public void testLocalClass () {
        class CheckPersonEligibleForSelectiveService implements CheckPerson {
        int expected = 3;
        int count = 0;
            @Override
            public Boolean test(Person p) {
                for (Person per : testArray) {
                    if (p.getAge () > 25) {
                        count++;
                    }
                }
                return count == expected;
            }
        }
    }


}

