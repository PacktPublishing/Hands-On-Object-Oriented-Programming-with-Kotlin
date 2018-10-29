package Chapter9.CallKotlinFromJava;


import java.util.List;

public class FromJava {

    public void callAddFunction() {

        CallKotlinKt.add(5,5);

        int result = CallKotlinKt.addAndReturn(5,5);

        System.out.print("From Kotlin " + result);
    }

    public void callExtensionFunction(){

        int i = 5;

        int result = CallKotlinKt.doubleTheValue(i);

        System.out.print("Kotlin doubleTheValueEx of "+ i +" = "+ result);

    }

    public void callGetMutableList() {

        System.out.print("Kotlin mutable list");

        //List<int> listFromKotlin = KotlinToJavaKt.mutableList();

        List<Integer> listFromKotlin = CallKotlinKt.getMutableList();

        listFromKotlin.add(6);

        for (int i = 0; i < listFromKotlin.size(); i++) {

            System.out.print("Element " +  listFromKotlin.get(i));

        }
    }

    public void callGetImmutableList() {

        System.out.println("Kotlin immutable list");

        List<Integer> listFromKotlin = CallKotlinKt.getImmutableList();

        // so be careful while adding element in immutable list.
        //listFromKotlin.add(6);


        for (int i = 0; i < listFromKotlin.size(); i++) {

            System.out.println("Element " +  listFromKotlin.get(i));

        }
    }


    class CallKotlinClass {

        public void callShpaeInstance() {

            Shape shape = new Shape(5,9,"Shape");

            shape.shapeMessage();

            System.out.println(shape.getShape() + " width " + shape.getWidth());
            System.out.println(shape.getShape() + " height " + shape.getHeight());
            System.out.println(shape.getShape() + " area " + shape.getArea());

            shape.draw();
        }
    }

    public void  WithJvmAnnotation(){

        KotlinUtil.addition(4,4);
        KotlinUtil.addDouble(5.0, 5.0);

    }


    public void callSingleton() {

        Singleton.INSTANCE.happy();

        Singleton.excited();

    }



    public static void main(String args[]) {

        Singleton.INSTANCE.happy();

        Singleton.excited();

    }

}

