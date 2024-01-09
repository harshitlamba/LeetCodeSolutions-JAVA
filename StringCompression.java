public class StringCompression {

    public static int compress(char[] chars) {
        int i,j,k;
        i=j=k=0;
        while (j < chars.length) {
            char current_char = chars[i];
            int count = 0;
            while ((j < chars.length) && (current_char == chars[j])) {
                count++;
                j++;
            }
            chars[k] = current_char;
            if (count > 1) {
                char[] num = String.valueOf(count).toCharArray();
                for (int l = 0; l < num.length; l++) {
                    k++;
                    chars[k] = num[l];
                }
            }
            k++;
            i=j;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(compress(new char[]{'a'}));
        System.out.println(compress(new char[]{'a','a','b','b','a','a','a'}));
        System.out.println(compress(new char[]{'a','b'}));
    }
}
