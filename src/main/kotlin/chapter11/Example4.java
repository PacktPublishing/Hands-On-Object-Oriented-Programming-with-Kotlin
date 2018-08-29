package chapter11;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;
import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        try {
            logger.append("Start...");
            //....
            logger.append("Done...");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Arrays.asList(0, 1, 3, 4).forEach(integer -> {
            try {
                logger.append(integer.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}



class Logger implements Appendable {

    @Override
    public Appendable append(CharSequence csq) throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public Appendable append(char c) throws IOException {
        throw new NotImplementedException();
    }
}