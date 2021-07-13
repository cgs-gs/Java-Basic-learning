package Day809;

public class Student {
    private int Id;
    private String name;
    private int age;
    static String room;
    static int Intcount = 0;

    public Student(){
        Intcount ++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.Id = Intcount ++;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
