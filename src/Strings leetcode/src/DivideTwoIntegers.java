public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        long count=1;
        long modivisor = Math.abs((long) divisor);
        long sum = modivisor;
        long modividend = Math.abs((long) dividend);
        int oper = 0;
        while (sum <= modividend){
            sum+=modivisor;
            count++;
        }
        count--;
        if(dividend<0 && divisor<0){
            oper = 1;
        }else if(dividend<0 || divisor<0){
            oper = -1;
        } else {
            oper = 1;
        }
        if (count> 2147483647){
            if(divisor<0){
                count = 2147483647;
            }
        }
        return (int)count*oper;
    }
}
