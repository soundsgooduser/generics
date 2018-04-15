package generics.bounded.example2;

public class Phone extends Product<Phone> {
    protected int deepCompare(Phone p) {
        return 0;
    }
}
