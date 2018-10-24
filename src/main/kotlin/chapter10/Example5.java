package chapter10;

import java.io.IOException;

public class Example5 {
    public static void main(String[] args) {
        try {
            Example5Kt.testMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void testMethod() {
//        throw new IOException();
//    }
}

