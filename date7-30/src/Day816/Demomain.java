package Day816;

public class Demomain {
    public static void main(String[] args) {
        Outer obj = new Outer() {
            @Override//注解
            public void method() {
                System.out.println("匿名内部类方法执行了！");
            }
        };
        obj.method();

    }
}
