package Day804;

public class FengZhuang {
    String name;
    private int age;
    private boolean male;


    public void show() {
        System.out.println("我叫  " + name + "," + "年龄  ：" + age);
    }
    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }
    public void setAge(int num){
        if(age < 100 && age >9){
        age = num;
        }else{
            System.out.println("数据不合理");
        }

    }
    public int getAge(){
        return age;
    }
}
