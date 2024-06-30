import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                long num=1;
                for(int c=0;c<rowIndex;c++){
                    num=num*(rowIndex-c)/(c+1);
                    list.add((int)num);
                }
                return list;
    }
}
