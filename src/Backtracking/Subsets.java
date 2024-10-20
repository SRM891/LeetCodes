package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> findSubset(int[] nums){
        helper(nums, 0, new ArrayList<>());
        return result;
    }
    public void helper(int[] nums, int index, List<Integer> subList){
        if(index==nums.length){
            result.add(new ArrayList<>(subList));
            return;
        }
        subList.add(nums[index]);
        helper(nums, index+1, subList);
        subList.removeLast();
        helper(nums, index+1, subList);
    }
}
