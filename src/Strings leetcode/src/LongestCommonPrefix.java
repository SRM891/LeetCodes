public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr={"leetcode", "leet", "lead"};
        System.out.println(lcp(arr));
    }
    public static String lcp(String[] str){
        String prefix;
        if(str.length==0) return "";
        else {
            prefix = str[0];
            for(int i=1; i<=(str.length)-1; i++){
                while (str[i].indexOf(prefix)!=0){
                    prefix = prefix.substring(0, prefix.length()-1);
                    if(prefix==""){
                        return "";
                    }
                }
            }
        }
        return prefix;
    }
}

