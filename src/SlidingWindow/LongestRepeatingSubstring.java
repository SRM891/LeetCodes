package SlidingWindow;

public class LongestRepeatingSubstring {
    public int characterReplacement(String s, int k) {
        int next = 0;
        int sum = 0;
        int i = 0;
        int thres = k;
        int resmax = 0;
        char[] arr = s.toCharArray();
        while (i<arr.length-1 && next<arr.length){
            if(arr[next+i]==arr[i]){
                sum++;
                next++;
            } else if(thres>0){
                thres--;
                sum++;
                next++;
            } else {
                i++;
                sum = 0;
                next = 0;
            }
            resmax = Math.max(resmax, sum);
        }
        return resmax;
    }
}
