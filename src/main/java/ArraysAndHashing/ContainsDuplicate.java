package ArraysAndHashing;

import java.util.HashMap;

//1.Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
public class ContainsDuplicate {
    public ContainsDuplicate() {
    }

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int num : nums) {
            if (hm.get(num) != null) {
                return true;
            } else {
                hm.put(num, 1);
            }
        }
        return false;
    }
}
