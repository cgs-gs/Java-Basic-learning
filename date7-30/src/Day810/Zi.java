package Day810;

public class Zi extends Employee {
    int num = 60;

    public  void method(){
        int num = 25;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
