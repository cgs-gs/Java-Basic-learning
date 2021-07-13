package Day1125;

public class test2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("Day1125.User");
        System.out.println(c1);
        Class c2 = User.class;
        User user = new User();
        Class c3 = user.getClass();
        Class c4 = Integer.TYPE;

        System.out.println(c1==c2);
        System.out.println(c4);
    }
}

class User{
    private String name;
    private int age;
    private int id;

    public User() {
    }

    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
