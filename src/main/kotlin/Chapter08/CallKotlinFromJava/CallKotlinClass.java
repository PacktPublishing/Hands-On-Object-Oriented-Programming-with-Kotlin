package Chapter08.CallKotlinFromJava;

class FromKotlinClass {

    public void callShpaeInstance()
    {

        Shape shape = new Shape(5,9,"Shape");

        shape.shapeMessage();
        shape.setHeight(10);

        System.out.println(shape.getShape() + " width " + shape.getWidth());

        System.out.println(shape.getShape() + " height " + shape.getHeight());

        System.out.println(shape.getShape() + " area " + shape.calculateArea());

        shape.draw();
    }
}


public class CallKotlinClass {

    public static void main(String args[]){

        FromKotlinClass fromKotlinClass = new FromKotlinClass();

        fromKotlinClass.callShpaeInstance();

    }
}