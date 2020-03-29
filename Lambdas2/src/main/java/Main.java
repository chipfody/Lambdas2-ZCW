import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test ( p )) {
                p.printPerson ();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> setUp = new ArrayList<> ();

        Person person1 = new Person ( "Scott Summers", LocalDate.of ( 1963, 4, 11 ), Person.Sex.MALE, "oneeye@gmail.com" );
        Person person2 = new Person ( "Jean Gray", LocalDate.of ( 1974, 10, 10 ), Person.Sex.FEMALE, "turningDark@gmail.com" );
        Person person3 = new Person ( "Charles Xavier", LocalDate.of ( 1943, 12, 23 ), Person.Sex.MALE, "baldIsBeautiful@aol.com" );
        Person person4 = new Person ( "Bobby Drake", LocalDate.of ( 1986, 1, 30 ), Person.Sex.MALE, "iceman000@yahoo.com" );
        Person person5 = new Person ( "Warren Worthington", LocalDate.of ( 1999, 5, 9 ), Person.Sex.MALE, "sliceAndDice@verizon.com" );
        Person person6 = new Person ( "Ororo Munroe", LocalDate.of ( 1954, 3, 10 ), Person.Sex.FEMALE, "bringOnTheLightning@gmail.com" );
        Person person7 = new Person ( "Kurt Wagner", LocalDate.of ( 1979, 8, 18 ), Person.Sex.FEMALE, "oneeye@usg.gov" );
        Person person8 = new Person ( "Sam Guthrie", LocalDate.of ( 2000, 1, 01 ), Person.Sex.MALE, "cannonBall@gmail.com" );
        Person person9 = new Person ( "Kate Pride", LocalDate.of ( 2010, 6, 27 ), Person.Sex.FEMALE, "shadowCat@aol.com" );
        Person person10 = new Person ( "Alex Summers", LocalDate.of ( 2007, 2, 07 ), Person.Sex.MALE, "reekHavoc@gmail.com" );

        setUp.add ( person1 );
        setUp.add ( person2 );
        setUp.add ( person3 );
        setUp.add ( person4 );
        setUp.add ( person5 );
        setUp.add ( person6 );
        setUp.add ( person7 );
        setUp.add ( person8 );
        setUp.add ( person9 );
        setUp.add ( person10 );

        //local class example:

        class CheckPersonEligibleForSelectiveService implements CheckPerson {
            public Boolean test(Person p) {
                return p.getGender () == Person.Sex.MALE
                        && p.getAge () >= 18
                        && p.getAge () <= 25;
            }
        }

// anonymous class example:
        printPersons(
                setUp,
                new CheckPerson() {
                    public Boolean test(Person p) {
                        return p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25;
                    }
                }
        );

// using lambda expression:
        printPersons ( setUp, person -> person.getAge () >= 30 );
    }

}