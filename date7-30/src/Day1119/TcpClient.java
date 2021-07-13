package Day1119;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        Socket s1 = new Socket("192.168.22.1",888);
        s1.getOutputStream().write("你好服务器".getBytes());
        InputStream input2 = s1.getInputStream();
        byte[] bytes = new byte[1024];
        int len = input2.read(bytes);
        System.out.println(new String(bytes,0,len));
        s1.close();
        long t = System.currentTimeMillis();
        System.out.println(t-s);
    }
}
