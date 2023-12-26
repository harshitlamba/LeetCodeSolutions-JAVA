public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String result = "";
        if (word1.length() == 0) {
            result = word2;
        } else if (word2.length() == 0) {
            result = word1;
        } else {
            int minItr = word1.length() >= word2.length() ? word2.length() : word1.length();
            for (int i = 0; i < minItr; i++) {
                result += word1.charAt(i);
                result += word2.charAt(i);
            }

            if (word1.length() > word2.length()) {
                result += word1.substring(minItr,word1.length());
            } else {
                result += word2.substring(minItr,word2.length());
            }
        }
        return result;
    }
    // If you are constructing a large string by appending or modifying it multiple times, StringBuilder is more
    // memory-efficient. Creating a large number of String objects can lead to excessive memory consumption.

    public static String mergeAlternatelyOptimized(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        if (word1.length() == 0) {
            result = new StringBuilder(word2);
        } else if (word2.length() == 0) {
            result = new StringBuilder(word1);
        } else {
            int minItr = word1.length() >= word2.length() ? word2.length() : word1.length();
            for (int i = 0; i < minItr; i++) {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }

            if (word1.length() > word2.length()) {
                result.append(word1.substring(minItr,word1.length()));
            } else {
                result.append(word2.substring(minItr,word2.length()));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternatelyOptimized("abc","pq"));
    }
}
