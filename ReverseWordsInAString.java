import java.util.regex.*;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.strip();
        Pattern pattern = Pattern.compile("\s+");
        String[] split_s = s.split(pattern.pattern());
        int i = split_s.length-1;
        for (; i > 0 ; i--) {
            sb.append(split_s[i] + " ");
        }
        sb.append(split_s[i]);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good    example "));
        System.out.println(reverseWords(" hello world "));
        System.out.println(reverseWords("its the end game"));
        System.out.println(reverseWords("yoyo"));
    }
}
