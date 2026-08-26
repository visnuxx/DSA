class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = i + 1;
            int sum=nums[i];
            if(sum==k){
                count++;
            }
            while (right<nums.length) {
                sum+=nums[right];
                if (sum == k) {
                    count++;
                }
                right++;
            }

        }
        return count;
    }
}