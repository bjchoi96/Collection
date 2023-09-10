package List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("value1");
        stringList.add("value2");
        stringList.add("value3");

        System.out.println(stringList.toString());
    }
}