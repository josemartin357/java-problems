import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // declaring HashMap
        Map<Integer, Person> map = new HashMap<>();
    
        // adding to map
        map.put(1, new Person("Alex"));    
        map.put(2, new Person("Alexa"));    
        map.put(3, new Person("Mariam")); 
        // overriding keys
        // map.put(3, new Person("Mariam 2"));    

        //printing
        System.out.println(map); // prints {1=Person[name=Alex], 2=Person[name=Alexa], 3=Person[name=Mariam]}
        
        // testing methods
        System.out.println(map.size()); //3
        System.out.println(map.get(1)); // Person[name=Alex]
        System.out.println(map.containsKey(4)); //false
        System.out.println(map.keySet()); //[1, 2, 3]
        System.out.println(map.entrySet()); // [1=Person[name=Alex], 2=Person[name=Alexa], 3=Person[name=Mariam]]

        // iterating
        map.entrySet().forEach(System.out::println); // 1=Person[name=Alex] 2=Person[name=Alexa] 3=Person[name=Mariam] 

        // forEach
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        }); // 1 - Person[name=Alex] 2 - Person[name=Alexa] 3 - Person[name=Mariam]

        // lambda
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue())); // 1 Person[name=Alex] 2 Person[name=Alexa] 3 Person[name=Mariam]

        // remove()
        map.remove(3);
        // get()
        System.out.println(map.get(3));// null
        // get() + default
        System.out.println(map.getOrDefault(3, new Person("default")));// Person[name=default]
        // values()
        System.out.println(map.values()); // [Person[name=Alex], Person[name=Alexa]]
    }

    // making a record object
    record Person(String name){}
}
