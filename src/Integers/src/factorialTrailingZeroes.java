import java.util.Scanner;
public class factorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailing_zeroes(7));
    }

    public static int trailing_zeroes(int n){
        int count = 0;
        while (n>0){
            n/=5;
            count+=n;
        }
        return count;
    }
}
