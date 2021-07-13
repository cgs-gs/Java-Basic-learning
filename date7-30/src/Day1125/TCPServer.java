package Day1125;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\FILE\\1.jpg");
        ServerSocket ss1 = new ServerSocket(888);
        Socket s1 = ss1.accept();
        InputStream is = s1.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        s1.getOutputStream().write("上传成功".getBytes());
        fos.close();
        s1.close();
        ss1.close();


        


    }
}
