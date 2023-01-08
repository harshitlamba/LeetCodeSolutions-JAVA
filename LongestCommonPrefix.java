import java.util.Arrays;

public class LongestCommonPrefix {
    /** Approach 1 - Base Solution */
    /*
        public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0]; String last = strs[strs.length-1];
        int itr = 0;
        String prefix = "";
        while ((itr < first.length()) & (itr < last.length())) {
            if (first.charAt(itr) == last.charAt(itr)) {
                prefix += first.charAt(itr);
                itr++;
            } else {
                break;
            }
        }
        return prefix;
    }
     */

    /** Approach 2 - Optimized Solution */
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    
    public static void main(String[] args) {
        String[] strs = new String[]{"flow","flower","flowing"};
        System.out.println(longestCommonPrefix(strs));
    }
}
