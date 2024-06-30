import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length/3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int u: nums){
            map.put(u, map.getOrDefault(u, 0)+1);
        }
        for (Integer i: map.keySet()){
            if (map.get(i)>n){
                list.add(i);
            }
        }
        return list;
    }
}
