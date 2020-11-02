package P16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;

                if (sum == target) {
                    ans = sum;
                }
                if (sum > target) {
                    l++;
                } else r--;
            }
            return ans;
        }
        return ans;
    }
}
