public class ReverseString {
    public static char[] reverseString(char[] s) {
        if (s == null) {
            return null;
        }
        int start = 0;
        int end = s.length - 1;
        while(start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
        return s;
    }

    public static void main(String[] args) {
        char[] s = new char[]{'H','a','n','n','a','h'};
        char[] reversedString = reverseString(s);
        for (char c : reversedString) {
            System.out.print(c);
        }
    }
}
