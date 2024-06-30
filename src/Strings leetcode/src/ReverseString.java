import java.util.Arrays;
class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o','d'};
        System.out.println(reverseIt(arr));
    }
    public static String reverseIt(char[] v){
        int left = 0;
        int right = v.length-1;
        while(left < right){
            char temp = v[left];
            v[left] = v[right];
            v[right]=temp;
            left++;
            right--;
        }
        return Arrays.toString(v);
    }
}