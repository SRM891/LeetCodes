import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = inp.nextInt();
        int pop;
        int reversedNum;
        if (x<0 || (x%10 == 0 && x!=0)) {
            System.out.println("not palindrome");
        } else{
            reversedNum = 0;
            while (x>reversedNum){
                pop = x%10;
                reversedNum=reversedNum*10+pop;
                x=x/10;
            }
            if (x==reversedNum||x==reversedNum/10){
                System.out.println("It's a palindrome");
            }else{
                System.out.println("False");
            }

        }

    }
}
