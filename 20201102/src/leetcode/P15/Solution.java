package leetcode.P15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> threeSum(int[] nums) {
        //对数组进行排序，方便去重
           ans = new ArrayList<>();
          if(nums == null || nums.length < 3) return ans;
            Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if (nums[i] > 0) break;
            if (i == 0 || nums[i] != nums[i - 1]) {//Input: nums = [0]  Output: []
                twosum(nums, i);
            }
        }
        return ans;
    }

            public void twosum ( int[] nums, int index){
                int target = - nums[index];
                int l = index + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[l] + nums[r];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[index], nums[l], nums[r]));
                        while (l + 1 < r && nums[l] == nums[l + 1]) l++;
                        while (r - 1 > l && nums[r] == nums[r - 1]) r--;
                    }
                        if (sum > target)
                            r--;
                        else l++;


                }
            }
}

