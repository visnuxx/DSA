class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []nums=new int[nums1.length+nums2.length];
        double res=0;
        int i=nums1.length-1;
        int j=nums2.length-1;
        int k=nums.length-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums[k]=nums1[i];
                i--;
            }
            else{
                nums[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            nums[k]=nums1[i];
            i--;
            k--;
        }
        while(j>=0){
            nums[k]=nums2[j];
            j--;
            k--;
        }
        if(nums.length%2==0){
            int a=nums.length/2-1;
            int b=nums.length/2;
            return (double) (nums[a]+nums[b])/2;
        }
        else{
            int a=nums.length+1/2;
            return (double)nums[nums.length/2];
        }
    }
}