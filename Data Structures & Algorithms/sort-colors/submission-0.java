class Solution {

    private void swap(int[] nums, int leftIndex, int rightIndex){
        int tmp = nums[leftIndex];
        nums[leftIndex] = nums[rightIndex];
        nums[rightIndex] = tmp;
    }

    public void sortColors(int[] nums) {

        int zeroIndex = 0, twoIndex = nums.length-1;

        for(int currIndex=0; currIndex < nums.length; currIndex++){
            if(nums[currIndex] == 0){
                swap(nums, currIndex, zeroIndex);
                zeroIndex++;
            }
        }
        
        for(int currIndex = nums.length-1; currIndex >= 0; currIndex--){
            if(nums[currIndex] == 2){
                swap(nums, currIndex, twoIndex);
                twoIndex--;
            }
        }
        
    }
}