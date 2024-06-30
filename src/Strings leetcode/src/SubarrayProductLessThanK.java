public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int product = 1;
        for (int i=0; i<nums.length-1; i++){
            if(nums[i]<k){
                product=nums[i];
                count++;
            }else{
                continue;
            }
            for (int j=i+1; j<nums.length; j++){
                product*=nums[j];
                if(product<k){
                    count++;
                }else{
                    break;
                }
            }
        }
        if(nums[nums.length-1]<k){
            count++;
        }
        return count;
    }
}
