class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        return binarySearch(nums,low,high,target);
        
    }
    public int binarySearch(int[] nums,int low,int high,int target){
         if(low>high){
            return low;
        }
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                return binarySearch(nums,mid+1,high,target);
            }
            else if(nums[mid]>target){
                return binarySearch(nums,low,mid-1,target);
            }
            return -1;
    }
}