package Chapter08.CallJavaFromKotlin;
import java.util.ArrayList;
import java.util.Scanner;

public class CallJava {


    public static String message = "Hello from Java";

    public static void add(int i, int j){

        System.out.println(i + " + " + j +" = " + (i + j));

    }

    public static double getAreaOfCircle(double radius) {

        return Shape.PI * radius * radius;
    }

    public static void inputFromKeyboard(){

        System.out.println("Enter some input....  Java");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());

    }

    public static void is(){
        System.out.println("is is a reserved keyword in Kotlin :-) ");

    }

    public static void var(){
        System.out.println("var is a reserved keyword in Kotlin :-) ");
    }



    public static ArrayList<Integer> getIntList(){

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);integers.add(2);integers.add(3);

        return integers;
    }






    public static void main(String args[]) {

        inputFromKeyboard();

    }
}

