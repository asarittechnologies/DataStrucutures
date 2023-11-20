package DataStructures;

import java.util.Stack;

public class EvaluateRegularExpression {


    public static void main(String[] args) {
        String[] numbersWithOperators = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRegex(numbersWithOperators));
    }

    private static int evalRegex(String[] numbersWithOperators) {
        Stack<String> stack = new Stack<>();
        int result = 0;
        String operators = "+-*/";
        for(String n: numbersWithOperators){
            if(!operators.contains(n)){
                stack.push(n);
            }else{
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (n){
                    case "+" :
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a/b));
                        break;
                }
            }
        }
        result = Integer.parseInt(stack.pop());
        return result;
    }

}
