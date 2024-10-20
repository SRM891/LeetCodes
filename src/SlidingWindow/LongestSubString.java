package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int resmax = 1;
        int first = 0;
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++) {
            while (set.contains(arr[i])){
                set.remove(arr[first]);
                first++;
            }
            set.add(arr[i]);
            resmax = Math.max(resmax, i - first + 1);
        }
        return resmax;
    }
}
