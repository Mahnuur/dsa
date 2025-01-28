public class ReverseString {
    public static void main(String[] args) {
        ReverseString solution = new ReverseString();

        // Example test case
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original array: " + String.valueOf(s));

        solution.reverseString(s);

        System.out.println("Reversed array: " + String.valueOf(s));
    }

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

