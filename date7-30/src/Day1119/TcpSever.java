package Day1119;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSever {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(888);
        Socket s1 = server.accept();
        InputStream input1 = s1.getInputStream();
        byte[] bytes = new byte[1024];
        int len = input1.read(bytes);
        System.out.println(new String(bytes,0,len));
        s1.getOutputStream().write("收到了".getBytes());
        s1.close();
        server.close();
    }
}
