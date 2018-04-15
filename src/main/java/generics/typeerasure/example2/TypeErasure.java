package generics.typeerasure.example2;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

    public static void main(String[] args) {
        // List<? extends Number> - erases public static void method1(List<Number> first, List<Number> second)
        // List<? extends Number> - erases public static void method2(List<Number> first, List<Number> second)

        method1(new ArrayList<Double>(), new ArrayList<Long>()); // compile success
        //method2(new ArrayList<Double>(), new ArrayList<Long>()); // compile failure as T has different types - Double and Long
    }

    public static void method1(List<? extends Number> first, List<? extends Number> second) {
        Number n = first.get(0);
        Number m = second.get(0);
        List<Number> third = new ArrayList<Number>();
        third.add(n);
        third.add(m);
        System.out.println(third);
    }

    public static <T extends Number> void method2(List<T> first, List<T> second) {
        T n = first.get(0);
        T m = second.get(0);
        List<T> third = new ArrayList<T>();
        third.add(n);
        third.add(m);
        System.out.println(third);
    }
}
