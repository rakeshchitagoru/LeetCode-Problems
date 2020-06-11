class Solution {
    public int searchInsert(int[] nums, int target) {
        //for(int i=0;i<nums.length;i++){
          //  if(nums[i]>=target)
            //    return i;
        //}
        //return nums.length;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(target == nums[mid])
                return mid;
            else if(target>nums[mid]){
                left=mid+1;
            }
            else
                right=mid-1;
        }
        return left;
    }
}