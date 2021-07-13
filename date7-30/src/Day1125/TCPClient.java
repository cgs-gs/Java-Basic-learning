package Day1125;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\陈光胜\\Pictures\\陈光胜证件照\\1寸蓝底.jpg");
        Socket s1 = new Socket("192.168.22.1", 888);
        OutputStream outs = s1.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            outs.write(bytes,0,len);
        }
        s1.shutdownOutput();

        InputStream ints = s1.getInputStream();
        while ((len = ints.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
//        outs.close();
//        ints.close();
        s1.close();

    }
}
