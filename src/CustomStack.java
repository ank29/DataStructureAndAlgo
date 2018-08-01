import java.util.Arrays;
import java.util.Stack;

public class CustomStack {
    public static boolean isPair(char a,Stack<Character> stack){
        char c = stack.peek();
        if(a == '}' && c == '{'){
            stack.pop();
            return true;
        }
        if(a == ')' && c == '('){
            stack.pop();
            return true;
        }
        if(a == ']' && c == '['){
            stack.pop();
            return true;
        }
        return false;
    }
    public static boolean BalancedString(String a){
        char[] arr = a.toCharArray();
        Stack<Character> stack = new Stack();
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == '{' || arr[i] == '(' || arr[i] == '[')
                stack.push(arr[i]);
            if(arr[i] == '}' || arr[i] == ')' || arr[i] == ']' )
                return isPair(arr[i],stack);
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String a = "{{{({}({}[])}}()[]}";
        boolean b =BalancedString(a);
        if(b == true)
            System.out.println("balanced");
        else System.out.println("not balanced");
    }
}
