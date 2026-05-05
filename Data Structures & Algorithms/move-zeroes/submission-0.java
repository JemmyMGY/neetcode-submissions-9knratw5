class Solution {
    private void swap(int[] nums, int left, int right){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
    
    public void moveZeroes(int[] nums) {
        int left = 0, n = nums.length;

        for(int right = 0; right < n; right++){
            if(nums[right] != 0){
                swap(nums, left, right);
                left++;
            }
        }
        
    }
}