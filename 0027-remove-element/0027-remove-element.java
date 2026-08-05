class Solution {
    public int removeElement(int[] nums, int val) {
      int left=0;
      int res=0;
      for(int right=0;right<nums.length;right++){
        if(nums[right]!=val){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
        }
      }
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            res++;
        }
      }
      return  res;
    }
}