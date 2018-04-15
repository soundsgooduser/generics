package generics.bounded.example2;

public class Camera extends Product<Camera> {
    protected int deepCompare(Camera p) {
        return 0;
    }
}
