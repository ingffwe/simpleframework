package demo.generic;

import java.util.LinkedList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList();
        linkedList.add("words");
        linkedList.add("1");
        for (int i = 0; i < linkedList.size(); i++) {
            String item = (String) linkedList.get(i);
            System.out.println(item);
        }
        GenericClassExample<String> stringGenericClassExample = new GenericClassExample<String>("111");
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {1.1,1.2,1.3};
        stringGenericClassExample.printArray(integers);

    }
}
