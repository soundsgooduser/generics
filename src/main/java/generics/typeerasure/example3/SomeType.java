package generics.typeerasure.example3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SomeType<E> {

    public static void main(String[] args) {
        SomeType someType = new SomeType(); // ClassCastException
        //SomeType<Object> someType = new SomeType<Object>(); // No ClassCastException
        List<String> list = Arrays.asList("value");
        someType.test(list);
    }

    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

    public void test(List<Integer> collection) {
        for (Integer e : collection) {
            System.out.println(e);
        }
    }
}
