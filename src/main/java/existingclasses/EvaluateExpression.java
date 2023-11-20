package existingclasses;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
    public static int evalRPN(String[] tokens) {
        int returnValue =0;
        Stack<String> stack = new Stack<String>();
        String operators = "+-*/";
        for(String i:tokens){
            if(!operators.contains(i)){
                stack.push(i);
            }else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (i) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a / b));
                        break;
                }
            }
        }
        return Integer.valueOf(stack.pop());
    }
}


