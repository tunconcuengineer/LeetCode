package Easy.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            int num = target - nums[i];
            if(hash.containsKey(num)){
                return new int[]{hash.get(num),i};
            }
            hash.put(nums[i], i);
        }
        return new int[]{};
        
        
    }
}