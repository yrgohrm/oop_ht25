import java.util.*;

public class Comp {
    private int foo;
    
    public record Person(String name, int age) implements Comparable<Person> {

        @Override
        public int compareTo(Person o) {
            Comparator<Person> comp = Comparator.comparingInt(Person::age).thenComparing(Person::name);
            return comp.compare(this, o);
        }

    }





}
