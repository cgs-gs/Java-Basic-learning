package Day1009;

import java.io.File;
import java.io.IOException;

public class Demo01File {
    public static void main(String[] args) throws IOException {
        File f1 = new File("G:\\Idea Projects\\basic_code\\date7-30\\a.txt");
        boolean a = f1.createNewFile();
        System.out.println(a);
    }
}
