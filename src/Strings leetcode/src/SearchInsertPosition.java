public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int mid = nums.length/2;
        int left = 0;
        int right = nums.length;
        while (left<right && mid!=right && mid != left){
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target){
                left = mid;
                mid = (left+right)/2;
            } else if(nums[mid]>target){
                right=mid;
                mid = (right-left)/2;
            }
        }
        return nums[mid]<target?mid+1:mid;
    }
}
