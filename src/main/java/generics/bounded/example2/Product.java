package generics.bounded.example2;

public abstract class Product<T extends Product<T>> implements Comparable<T> {


    public int compareTo(T o) {
        return 0;
    }

    protected abstract int deepCompare(T p);
}
