import java.util.Arrays;

public class TheKWeakestRowInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] array = new int[mat.length];
        int[] res = new int[k];
        Arrays.fill(res, 101);
        int sum=0;
        for(int i=0; i< mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                sum+=mat[i][j];
            }
            array[i]=sum;
            sum=0;
        }
        int idx = -1;
        for (int i=0; i<k; i++){
            for (int j=0; j<array.length; j++){
                if(array[j]<res[i]){
                    res[i]=array[j];
                    idx=j;
                }
            }
            res[i]=idx;
            array[idx]=101;
            idx = -1;
        }
        return res;
    }
}
