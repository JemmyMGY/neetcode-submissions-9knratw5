class Solution {

    private void swap(int[] nums, int left, int right){
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    private void reverseSubArray(int[] nums, int startIndex){


        int size = nums.length, midIndex = (size + startIndex) / 2;

        for(int i = startIndex; i < midIndex; i++){
            swap(nums, i, size - i - 1 + startIndex);
        } 
    }

    public void nextPermutation(int[] nums) {
        int pivotIndex = -1;

        for(int i = nums.length - 1; i >0; i--){
            if(nums[i] > nums[i-1]){
                pivotIndex = i-1;
                break;
            }
        }

        if(pivotIndex == -1){
            Arrays.sort(nums);
            return;
        }

        // find the rightmost element that is greater than pivot element
        // swap with pivot
        // reverse the right window before pivot

        for(int i = nums.length - 1; i > pivotIndex; i--){
            if(nums[i] > nums[pivotIndex]){
                swap(nums, i, pivotIndex);
                break;
            }
        }

        reverseSubArray(nums, pivotIndex+1);


        
    }
}