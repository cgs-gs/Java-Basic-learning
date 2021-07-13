package Day1120;

import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter {
    public static void main(String[] args)  {
        FileWriter fw = null;
        try{
            fw = new FileWriter("C:\\Idea Projects\\basic_code\\date7-30\\src\\Day1119\\d.txt");
            fw.write("你好呀",0,2) ;
            fw.flush();

        }catch (IOException e){
            System.out.println(e);

        }finally {
            if(fw != null){
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
            }
        }

    }
}
