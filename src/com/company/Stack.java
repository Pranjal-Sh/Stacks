package com.company;

public class Stack {
    int top;
    int[] arr = new int[5];

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
}
