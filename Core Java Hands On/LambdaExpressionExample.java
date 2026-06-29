import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressionExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Orange");
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        Collections.sort(list,(a,b)->a.compareTo(b));

        System.out.println(list);
    }
}
