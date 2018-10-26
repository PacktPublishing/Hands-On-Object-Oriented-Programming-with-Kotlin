package Chapter9.CallJavaFromKotlin;

/**
 * Created by KHAN on 2018-10-23.
 */
public class Shape {

    private int width;
    private int height;

    public static final double PI = 3.1415;

    private final String shape;

    public Shape(int width, int height, String shape) {

        this.width = width;
        this.height = height;
        this.shape = shape;
    }

    public final void shapeMessage() {
        System.out.println("Hi i am " + this.shape + ", how are you doing");
    }

    public final int getHeight() {
        return this.height;
    }

    public final void setHeight(int value) {
        this.height = value;
    }

    public final String getShape() {
        return this.shape;
    }

}
