import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        // printing
        System.out.println(balls.size());// prints 3; note duplicate rejected

        // using forEach to print each element
        balls.forEach(System.out::println);// prints Ball[color=red] Ball[color=blue]  Ball[color=yellow]

    }

    record Ball(String color){}
}
