package Day901;

public class RegisterException extends Exception {
    //添加空参数的构造方法
    public RegisterException(){
        super();
    }
    public RegisterException(String message){
        super(message);
    }

}
