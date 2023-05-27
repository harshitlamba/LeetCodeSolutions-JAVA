public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ",0);
        return (strings[strings.length - 1]).length();
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        System.out.println("The length of the last word in string s1 is: " + lengthOfLastWord(s1));
        System.out.println("The length of the last word in string s2 is: " + lengthOfLastWord(s2));
        System.out.println("The length of the last word in string s3 is: " + lengthOfLastWord(s3));
    }
}
