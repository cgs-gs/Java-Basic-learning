package Day1120;

import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("G:\\Idea Projects\\basic_code\\date7-30\\src\\Day1119\\a.txt");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));


        }
        fr.close();

       /* int leng = 0;
        while((len = fr.read()) != -1){
            System.out.println((char)leng);
        }
        fr.close();*/
    }
}
