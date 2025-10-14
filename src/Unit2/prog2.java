package Unit2;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class prog2 {
    // functional interface that are inbuilt
    public static void main(String[] args)
    {

        Predicate<Integer> isEven= n->n%2==0;
        System.out.println(isEven.test(22));
        Function<Integer,Integer>square=n->n*n;
        System.out.println("Square of 5: "+square.apply(5));
        Consumer<String> display= msg->System.out.println(msg);
        display.accept("Hellooooooooooo");
        Supplier<Double> randomValue=()->Math.random();
        System.out.println("RANDOM NUMBER: "+randomValue.get());
    }
}
