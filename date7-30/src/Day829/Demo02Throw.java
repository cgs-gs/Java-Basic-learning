package Day829;

public class Demo02Throw {
    public static void main(String[] args) {
        int[] arr = null;
        int e = getElement(arr, 4);
        System.out.println(e);


    }
    public static int getElement(int[] arr,int index){
        if(arr == null){
            throw new NullPointerException("传递的数组为空");
        }
        if(index < 0 || index >arr.length - 1){
            throw new IndexOutOfBoundsException("超出范围");
        }
        int ele = arr[index];
        return ele;
    }
}
