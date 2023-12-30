public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            int gcd;
            if (str1.length() > str2.length()) {
                gcd = calculateGcd(str1.length(),str2.length());
            } else {
                gcd = calculateGcd(str2.length(),str1.length());
            }
            return str1.substring(0,gcd);
        } else {
            return "";
        }
    }

    private static int calculateGcd(int a, int b) {
        return b == 0 ? a : calculateGcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println("GCD is: " + gcdOfStrings("ABCABC","ABC"));
        System.out.println("GCD is: " + gcdOfStrings("LEET","CODE"));
        System.out.println("GCD is: " + gcdOfStrings("ABABAB","AB"));
    }
}
