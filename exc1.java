import java.util.Scanner;
import java.util.Stack;

public class exc1 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String mystring = input.nextLine();
        input.close();
        char[] mychar = mystring.toCharArray();
        for (char ch : mychar) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
