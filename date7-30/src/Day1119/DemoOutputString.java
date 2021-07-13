package Day1119;

import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutputString {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("G:\\Idea Projects\\basic_code\\date7-30\\src\\Day1119\\a.txt");
        fos.write(96);
        fos.write("你好吗".getBytes());
        fos.close();

    }
}
