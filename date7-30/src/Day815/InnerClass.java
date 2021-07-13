package Day815;

public class InnerClass {
    public class Body{
        public void method(){
            System.out.println("内部类执行");
            System.out.println("我的名字是" + getName());
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void innerMethod(){
        System.out.println("方法执行！");
    }
}
