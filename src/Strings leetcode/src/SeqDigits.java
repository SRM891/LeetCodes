import java.util.ArrayList;
import java.util.List;

public class SeqDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String digits = "123456789";
        for (int i=1; i<=9; i++){
            for (int j=0; j+i<digits.length(); j++){
                String sub = digits.substring(j, i+j);
                int value = Integer.parseInt(sub);
                if (value>= low && value <=high){
                    list.add(value);
                }
            }
        }
        return list;
    }
}
