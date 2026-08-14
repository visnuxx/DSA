class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int count = 0;
        while (right < nums.length) {
            if (left == right) {
                right++;
                continue;
            }
            int diff = nums[right] - nums[left];
            if (diff == k) {
                count++;
                int rightValue = nums[right];
                int leftValue = nums[left];
                while (right < nums.length && nums[right] == rightValue) {
                    right++;
                }
                while (left < nums.length && nums[left] == leftValue) {
                    left++;
                }
            } else if (diff < k) {
                right++;
            } else {
                left++;
            }
        }
        return count;
    }
}