
package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person ("Tinizara", LocalDate.of(2000,Month.AUGUST, 1));
        System.out.println (person.getName() + " " + person.getAge());  

    }
    
}
