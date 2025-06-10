class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return rotatedSearch(nums,target,s,e);
    }
    public int rotatedSearch(int [] nums,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(nums[m]==target){
          return m;
        }
        if(nums[s]<=nums[m]){
            if(target>=nums[s] && target<=nums[m]){
                return rotatedSearch(nums,target,s,m-1);
            }
            else{
                return rotatedSearch(nums,target,m+1,e);
            }
        }
        else{
        if(target>=nums[m] && target<=nums[e]){
            return rotatedSearch(nums,target,m+1,e);
        }
        else{
        return rotatedSearch(nums,target,s,m-1);
    }}}
}