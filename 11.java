class Solution {
    public void sortColors(int[] nums) {
        // if(nums.length < 2 )
        //     return;
        // int start = 0, end = nums.length - 1, current = 0;
        // while( current <= end){
        //     if(nums[current] == 0){
        //         int temp = nums[current];
        //         nums[current] = nums[start];
        //         nums[start] = temp;
        //         current++;
        //         start++;
        //     } else if(nums[current] == 2){
        //         int temp = nums[current];
        //         nums[current] = nums[end];
        //         nums[end] = temp;
        //         end--;
        //     } else
        //         current++;
        // }
        int red = 0, white = 0, blue = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == 0)
                red++;
            else if(nums[i] == 1)
                white++;
            else if(nums[i] == 2)
                blue++;
        }
        for(int i = 0;i < nums.length;i++){
            if(i < red)
                nums[i] = 0;
            else if(i < red + white)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
//             nums[i] = 0;
        
//             nums[i+red] = 1;
        
//             nums[red+white+i] = 2;
    }
}