package Day806;

public class JavaBean {
    private String name;
    private int age;

    public void showName() {
        System.out.println("我叫 " + name);
    }

    public JavaBean() {
    }

    public JavaBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
