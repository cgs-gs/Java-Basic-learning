package Day1123;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoBufferedOutputString {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("王姝玮陈光胜".getBytes());
        bos.flush();
        bos.close();
        System.out.println(true);
    }
}
