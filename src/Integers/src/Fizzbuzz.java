import java.util.Scanner;
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("what is the number?");
        int x = inp.nextInt();
        for (int i=1; i<=x; i++){
        if(i%3==0 && i%5==0){
            System.out.println("FizzBuzz");
        } else if (i%3==0) {
            System.out.println("Fizz");
        } else if (i%5==0) {
            System.out.println("Buzz");
        } else {
            System.out.println("None");
        }
        }
    }
}
