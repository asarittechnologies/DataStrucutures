package DataStructures.easy;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        ValidParenthesis validParenthesis = new ValidParenthesis();
       // System.out.println(validParenthesis.isValidParenthesis("[{()}]"));
        System.out.println(validParenthesis.removeMinimumBrackets("a(bc(de)gh").toString());
    }
    public boolean isValidParenthesis(String str){
        char[] c = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
       // [{()}]
        for(int i=0;i<c.length;i++){
            switch (c[i]) {
                case '[':
                case '{':
                case '(':
                    stack.push(c[i]);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                    break;
            }

        }
        return stack.isEmpty();
    }

    public String removeMinimumBrackets(String str){
        char[] chars = str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(chars[i] == '('){
                stack.push(i);
            }else if(chars[i] == ')' && !stack.isEmpty()){
                stack.pop();
            }else if(chars[i] == ')'){
                chars[i] = ' ';
            }

        }
        while (!stack.isEmpty()){
            int index = stack.pop();
            chars[index] = ' ';
        }
        return new String(chars).trim().replace(" ","");
        //return chars.toString();

    }
}
// (sbc(cd)efgh
// 0,4
// 0