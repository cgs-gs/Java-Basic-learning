package Day805;

import java.util.ArrayList;
import java.util.List;

public class This {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums);
    }
    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {

        List<Integer> tmp = new ArrayList<>();
        backtrack(nums, tmp, 0);
        return res;
    }
    public static void backtrack(int[] nums, List<Integer> tmp, int start) {

        res.add(new ArrayList<>(tmp)); // 所有的都要，所以不需要递归终止条件
        for (int i=start;i<nums.length;i++) {

            tmp.add(nums[i]);

            backtrack(nums, tmp, i + 1);

            tmp.remove(tmp.size() - 1);
        }
    }
}
