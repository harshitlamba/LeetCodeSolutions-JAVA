public class ValidPalindrome {

    // Approach 1: Replacing non-alphanumeric characters with blanks and using two pointer
    // public boolean isPalindrome(String s) {
    //     s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    //     int i = 0;
    //     int j = s.length() - 1;
    //     boolean result = true;
    //     while (i <= j) {
    //         char fromBegin = s.charAt(i);
    //         char fromEnd = s.charAt(j);
    //         if (fromBegin != fromEnd) {
    //             result = false;
    //             break;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return result;
    // }

    // Approach 2: Two pointer without string replacement
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean result = true;
        while (i <= j) {
            char fromBegin = s.charAt(i);
            char fromEnd = s.charAt(j);
            if (Character.isLetterOrDigit(fromBegin) & Character.isLetterOrDigit(fromEnd)) {
                if (Character.toLowerCase(fromBegin) != Character.toLowerCase(fromEnd)) {
                    result = false;
                    break;
                }
                i++;
                j--;
            } else {
                if (!Character.isLetterOrDigit(fromBegin)) i++;
                if (!Character.isLetterOrDigit(fromEnd)) j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}