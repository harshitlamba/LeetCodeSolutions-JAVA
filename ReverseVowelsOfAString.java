import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowelsOfAString {
//    Approach 1: Using a Hashset; Converting the string to character array; Using tolowerCase() of Character class
    public static String reverseVowels(String s) {
        HashSet<Character> hashSet = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        char[] stringArray = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (i <= j) {
            if (hashSet.contains(Character.toLowerCase(stringArray[i])) && (hashSet.contains(Character.toLowerCase(stringArray[j])))) {
                char tmp = stringArray[i];
                stringArray[i] = stringArray[j];
                stringArray[j] = tmp;
                i++;
                j--;
            } else {
                if (!hashSet.contains(Character.toLowerCase(stringArray[i]))) {
                    i++;
                }
                if (!hashSet.contains(Character.toLowerCase(stringArray[j]))) {
                    j--;
                }
            }
        }
        return new String(stringArray);
    }

//    public static String reverseVowels(String s) {
//        Approach 2: Using vowel String containing upper and lower case alphabets; run while loop till encounter a vowel
//        String vowelString = "aeiouAEIOU";
//        char[] stringChars = s.toCharArray();
//        int i = 0;
//        int j = s.length()-1;
//        while (i < j) {
//            while ((i < j) && (vowelString.indexOf(s.charAt(i)) == -1)) {
//                i++;
//            }
//            while ((i < j) && (vowelString.indexOf(s.charAt(j)) == -1)) {
//                j--;
//            }
//            char tmp = stringChars[i];
//            stringChars[i] = stringChars[j];
//            stringChars[j] = tmp;
//            i++;
//            j--;
//        }
//        return new String(stringChars);
//    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("Euston saw I was not Sue."));
    }
}
