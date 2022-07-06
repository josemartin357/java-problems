import java.util.ArrayList;
import java.util.List;

// class needs different name other than collection type
public class ArrayListTest {
    public static void main(String[] args) {
        List <String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size()); // 3
        System.out.println(colors.contains("yellow")); // true
        System.out.println(colors.contains("pink")); // false
        System.out.println(colors); //output: [blue, purple, yellow]

        // testing loops
        // regular for loop
        for(String color : colors){
            System.out.println(color); //output: blue, purple, yellow
        }

        // for each loop
        colors.forEach(System.out::println); //output: blue, purple, yellow

        // for i loop
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i)); //output: blue, purple, yellow
        }
    }
}
