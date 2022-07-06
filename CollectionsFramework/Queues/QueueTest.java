import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        System.out.println(supermarket.size());// 3
        System.out.println(supermarket.peek());// Person[name=Alex, age=21]
        System.out.println(supermarket.poll());// Person[name=Alex, age=21]
        System.out.println(supermarket.size());// 2
        System.out.println(supermarket.peek());// Person[name=Mariam, age=18]
    }

    // static record
    // a record is a restricted form of a class. It's ideal for "plain data carriers," classes that contain data not meant to be altere
    static record Person(String name, int age){}
}
