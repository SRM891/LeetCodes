import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length<=1){
            return asteroids;
        }
        Stack<Integer> stk = new Stack<>();
        for (int i: asteroids){
            if (i>0) stk.push(i);
            else{
                while (stk.peek()<Math.abs(i)){
                    stk.pop();
                }
                if(stk.peek()<0 || stk.isEmpty()){
                    stk.push(i);
                }else if(Math.abs(stk.peek())==Math.abs(i)){
                    stk.pop();
                }
            }
        }
        int[] arr = new int[stk.size()];
        for (int i= arr.length-1; i>=0; i--){
            arr[i]=stk.pop();
        }
        return arr;
    }
}
