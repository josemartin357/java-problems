/* To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
Here we created a HashMap object called people that will store String keys and Integer values:*/

// Import the HashMap class
import java.util.HashMap;

public class HashMapWrapperClasses {
  public static void main(String[] args) {

    // Create a HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();


    // Add keys and values (Name, Age)
    people.put("John", 32); // key: Angie value: 33
    people.put("Steve", 30); // key: Steve value: 30
    people.put("Angie", 33); // key: John value: 32

    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
  }

}
