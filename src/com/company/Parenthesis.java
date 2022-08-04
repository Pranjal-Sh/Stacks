package com.company;

class StringStack{
    int top=-1;
    char arr[];

    StringStack(int n){
        this.arr = new char[n];
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        } else {
            return false;
        }
    }

    void push(char str){
        if(top>=arr.length){
            System.out.println("Stack overflow");
        } else {
            top++;
            arr[top] = str;
        }
    }

    String pop(){
        if(this.isEmpty()){
            System.out.println("Empty Stack");
            return "";
        } else {
            String popElement = Character.toString(arr[top]);
            top--;
            return popElement;
        }
    }

    char peek(){
        if(this.isEmpty()){
            return 'n';
        } else {
            return arr[top];
        }
    }
}

class Parenthesis{
    boolean isBalanced(String expression){
        StringStack stack = new StringStack(expression.length());

        for(int i=0;i<expression.length();i++){
            switch(expression.charAt(i)){
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if(stack.isEmpty()){
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }
        if(stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}

/*
        String expression = "((4)+5)/(2=8)";
        Parenthesis parenthesis = new Parenthesis();
        System.out.println("Parenthesis is balanced: "+parenthesis.isBalanced(expression));
*/