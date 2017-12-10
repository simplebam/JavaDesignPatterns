package visit;


import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Person> persons = new ArrayList<Person>();


    public void add(Person person) {
        persons.add(person);
    }

    public void remove(Person person) {
        persons.remove(person);
    }

    public void display(Action visitor) {
        for (Person person : persons) {
            person.accept(visitor);
        }
    }
}
