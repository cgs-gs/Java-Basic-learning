package Day1124;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectoutputString {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        oos.writeObject(new Person("王姝玮",18));
        oos.close();


    }
}
