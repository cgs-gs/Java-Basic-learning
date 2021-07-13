package Day815;

public class Demo01Main {
    public static void main(String[] args) {
        InnerClass.Body body = new InnerClass().new Body();
        body.method();

    }
}
