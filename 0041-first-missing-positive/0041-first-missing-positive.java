class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j = 1;
        int dup = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == dup || nums[i] <= 0) {
                continue;
            }
            if (nums[i] != j) {
                return j;
            }
            j++;
            dup = nums[i];
        }
        return j;
    }
}