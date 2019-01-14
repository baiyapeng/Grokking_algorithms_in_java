package dumaisoft.chapter08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String... args) {
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        List<String> list2 = new ArrayList<>();
        list.retainAll(list2);
        System.out.println(list);
    }
}
