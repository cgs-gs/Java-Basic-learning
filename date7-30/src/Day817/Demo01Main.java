package Day817;

public class Demo01Main {
    public static void main(String[] args) {
        Person p = new Person("张山",15);
        Person q = new Person("张山",15);
        String s = p.toString();

        System.out.println(s);
        System.out.println(p);
        boolean a = p.equals(p);
        System.out.println(a);


    }
}
