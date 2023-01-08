import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if ((s.length() == 0) | (s == null) | (s.length() % 2 != 0)) {
            return false;
        }
        Stack<Character> parenthesesStack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if ((current == '(') | (current == '{') | (current == '[')) {
                parenthesesStack.push(current);
            } else {
                if (parenthesesStack.isEmpty()) {
                    return false;
                }
                Character opening = parenthesesStack.pop();
                if (((current == ')') & (opening != '(')) | ((current == '}') & (opening != '{')) | ((current == ']') & (opening != '['))) {
                    return false;
                }
            }
        }
        if (parenthesesStack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));
    }
}
