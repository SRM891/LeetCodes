public class SortColors {
    public void sortColors(int[] nums) {
        for (int i=1; i< nums.length; i++){
            if(nums[i]<nums[i-1]){
                int temp = nums[i];
                int j=i-1;
                while(j>-1 && temp<nums[j]){
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    j--;
                }
            }
        }
    }
}
