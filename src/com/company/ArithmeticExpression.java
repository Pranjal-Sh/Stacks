package com.company;

class ArithmeticExpression{

    int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    String toPostScript(String expression){
        String result = "";
        StringStack opStack = new StringStack(expression.length());
        char c;

        for(int i=0; i<expression.length(); i++){
            c = expression.charAt(i);

            if(Character.isLetterOrDigit(c)){
                result += c;
            } else if(c=='('){
                opStack.push(c);
            } else if(c==')'){
                while(!opStack.isEmpty() && opStack.peek()!='('){
                    result+=opStack.pop();
                }
                opStack.pop();
            } else {
                while(!opStack.isEmpty() && precedence(c)<=precedence(opStack.peek())){
                    result += opStack.pop();
                }
                opStack.push(c);
            }
        }

        while(!opStack.isEmpty()){
            if(opStack.peek()=='('){
                return "Invalid expression";
            }
            result += opStack.pop();
        }
        return result;
    }

    int solveExpression(String expression){
        Stack stack = new Stack(expression.length()/2 +1);
        char c;
        int m, n, operation;

        if(this.toPostScript(expression) == "Invalid expression"){
            return -1;
        }
        expression = this.toPostScript(expression);

        for(int i=0; i<expression.length(); i++){
            c = expression.charAt(i);

            if(Character.isDigit(c)){
                stack.push(Integer.parseInt(String.valueOf(c)));
            } else {
                n = stack.pop();
                m = stack.pop();

                operation = operate(m,n,c);
                stack.push(operation);
            }
        }

        return stack.pop();
    }

    int operate(int i, int j, char c){
        switch (c){
            case '*':
                return i*j;
            case '/':
                return i/j;
            case '+':
                return i+j;
            case '-':
                return i-j;
            case '^':
                return i^j;
        }
        return 0;
    }
}

/*
        String exp = "(1+6/3)*(5*(2+3))";

        ArithmeticExpression expression = new ArithmeticExpression();
        System.out.println(expression.solveExpression(exp));
 */
