package generics.bounded.example2;

public class App {
    public static void main(String[] args) {
        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Phone phone1 = new Phone();

        camera1.compareTo(camera2);
        // camera1.compareTo(phone1); // compilation failure
    }
}
