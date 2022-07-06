import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        // adding objects to list
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        // using itetaror
        ListIterator<Person> personListIterator = linkedList.listIterator();
        // looping with iterator
        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        // looping backwards
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    

    // static record
    // a record is a restricted form of a class. It's ideal for "plain data carriers," classes that contain data not meant to be altere
    static record Person(String name, int age){}
}
