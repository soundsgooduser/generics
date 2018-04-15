package generics.typeerasure.example1;

public class TypeErasure {

    public static void main(String[] args) {
        // compile error for   - public static <E, K extends E> void method(K k, E[] e)
        // compile success for - public static void method(Object k, Object[] e)
        // both methods have same erasure so they can not be located at the same class
        //method("test", new Integer[3]);
    }

    public static <E, K extends E> void method(K k, E[] e) {
        // erased to static void method(Object k, Object[] e) {}
    }

/*   public static void method(Object k, Object[] e) {
    }
*/
}
