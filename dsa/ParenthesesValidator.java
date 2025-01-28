import java.util.Stack;

public class ParenthesesValidator {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesesValidator solution = new ParenthesesValidator();

        // Test cases
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";

        System.out.println(solution.isValid(s1)); // true
        System.out.println(solution.isValid(s2)); // true
        System.out.println(solution.isValid(s3)); // false
        System.out.println(solution.isValid(s4)); // false
        System.out.println(solution.isValid(s5)); // true
    }
}
