import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args){
        System.out.println(reverseStr("How are    you?"));
    }
    public static String reverseStr(String s){
        s=s.trim();
        String Answer = "";
        String[] Straight = s.split(" ");
        int left = 0;
        int right = Straight.length-1;
        while (left<right){
            String temp = Straight[left];
            Straight[left]=Straight[right];
            Straight[right]=temp;
            left++;
            right--;
        }
        for(String e: Straight){
            Answer=Answer+e+" ";
        }
        Answer= Answer.replaceAll("\\s+", " ");
        return Answer;
    }
}
