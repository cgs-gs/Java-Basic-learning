package Day809;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};
        String str = Arrays.toString(intArray);
        System.out.println(str);

        int[] array1 = {1,5,3,2,50,13,46};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        String str1 = "addowpiajdpowajdpo158898";
        char[] char1 =str1.toCharArray();
        Arrays.sort(char1);
        for (int i = char1.length - 1; i >= 0; i--) {
            System.out.println(char1[i]);
        }
    }
}
