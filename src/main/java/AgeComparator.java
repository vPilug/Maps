import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge().compareTo(o2.getAge()) == 0) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
        return o1.getAge().compareTo(o2.getAge());
    }
}

