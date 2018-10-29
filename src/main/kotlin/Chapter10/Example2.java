package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example2 {
    public static void main(String[] args) {
        try {
            new FileInputStream("invalid/path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
