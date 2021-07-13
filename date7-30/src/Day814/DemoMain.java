package Day814;

public class DemoMain {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        Cat cat = (Cat) animal;
        cat.watch();
    }
}
