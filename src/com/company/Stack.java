package com.company;

public class Stack {
    int top;
    int[] arr = new int[10];

    Stack(){
        this.top =-1;
    }

    void push(int element){
        if(top+1>=arr.length){
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = element;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int delElement = arr[top];
            top--;
            return delElement;
        }
    }

    int peek(){
        if(top<0){
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return arr[top];
        }
    }

    void display(){
        if(top<0){
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements are: ");
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }

    int findMid(){
        int mid = -1;
        if(top==-1){
            System.out.println("Empty Stack");
        } else {
            if(top%2==0){
                mid = arr[top/2];
            } else {
                mid = (arr[top/2] + arr[top/2 +1]) /2;
            }
        }
        return mid;
    }
}

/*
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();
        stack.push(7);
        stack.display();
        System.out.println("Mid element = "+stack.findMid());
 */
