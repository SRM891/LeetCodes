import java.util.HashMap;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char e: s.toCharArray()){
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        char u=' ';
        for(char v: t.toCharArray()){
            if (!map.containsKey(v)){
                u = v;
            }
            else{
                if(map.get(v)>1){
                    map.replace(v, map.getOrDefault(v, 0)-1);
                }else map.remove(v);
            }
        }
        return u;
    }
}
