package Day813;
//编译看左边，运行看右边

public class Mutil {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
//        obj.methodZi();
        Zi zi = new Zi();
        zi.method();
        Fu fu = new Fu();

    }
}
