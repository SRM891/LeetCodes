import java.util.*;
public class longestPalindromeSubstring {
    public static void main(String[] args){
        System.out.println(lps("babad"));
    }
    public static String lps(String s){
        int start = 0;
        int end = 0;
        if (s==null || s.length()<1){
            return "";
        }else{
            for (int i=0; i<s.length()-1;i++){
                int len1 = expandAroundCenter(s, i, i);
                int len2 = expandAroundCenter(s,i,i+1);
                int len = Math.max(len1, len2);
                if(len>end-start){
                    start = i -(len-1)/2;
                    end = i+len/2;
                }
            }
        }
        return s.substring(start, end+1);
    }
    public static int expandAroundCenter(String s, int left, int right){
        int L = left;
        int R = right;
        while(L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}
