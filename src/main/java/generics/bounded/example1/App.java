package generics.bounded.example1;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Container<Product> c1 = new Container();
        c1.setItem(new Phone());
        c1.setItem(new Camera());

        ////////////////////////////////

        // we need to avoid using Container and String so instead Container<T> use Container<T extends Product>
        Container<String> c2 = new Container();

        ///////////////////////////////

        List<Camera> src = new ArrayList<Camera>();
        src.add(new Camera());
        src.add(new Camera());

        List<Product> dest = new ArrayList<Product>();
        dest.add(new Product());
        dest.add(new Phone());
        dest.add(new Camera());

        copy(src, dest);

        System.out.println(dest.size());
    }

    public static void copy(List<? extends Product> src, List<? super Product> dest) {
        // List<? extends Product> src - IN-argument - use extends
        // List<? super Product> dest - OUT-argument - use super
        for (Product p : src) {
            dest.add(p);
        }
    }
}
