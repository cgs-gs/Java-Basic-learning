package Day809;

public class StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖",20);
        one.room = "101";
        Student two = new Student("黄蓉",18);
        System.out.println("姓名" + one.getName() + "   年龄"+ one.getAge()
            + "教室 " + one.room + "学号 " +one.getId());
        System.out.println("姓名" + two.getName() + "   年龄"+ two.getAge()
                + "教室 " + two.room +"学号 " +two.getId());

    }

}
