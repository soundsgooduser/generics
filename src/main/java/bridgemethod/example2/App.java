package bridgemethod.example2;

public class App {
    public static void main(String[] args) {
        NumericValue value = new NumericValue((byte)0);
        value.compareTo(value);  // fine
        //value.compareTo("abc");  // error
    }
}
