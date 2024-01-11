public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        boolean result = false;
        if (s.length() == 0) {
            result = true;
        } else if (t.length() == 0) {
            result = false;
        } else if (s.length() <= t.length()) {
            int s_itr, t_itr;
            s_itr = t_itr = 0;
            while (t_itr < t.length()) {
                if (s.charAt(s_itr) == t.charAt(t_itr)) {
                    s_itr++;
                }
                if (s_itr == s.length()) {
                    result = true;
                    break;
                }
                t_itr++;
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","mnoabdfc"));
        System.out.println(isSubsequence("tom","t"));
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));
        System.out.println(isSubsequence("a","a"));
        System.out.println(isSubsequence("",""));
        System.out.println(isSubsequence("a",""));
        System.out.println(isSubsequence("","m"));
    }
}
