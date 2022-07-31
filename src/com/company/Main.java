package com.company;


public class Main {
    static int[] arr = new int[6];

    static class twoStackInArray{
        int p, r, top;

        twoStackInArray(int p,int r){
            this.p = p;
            this.r = r;
            this.top = p-1;
        }

        void push(int element){
            if(top>r){
                System.out.println("Stack Overflow");
            } else {
                top++;
                arr[top] = element;
            }
        }

        int pop(){
            int delElement = 0;
            if(top<p){
                System.out.println("Stack Underflow");
            } else {
                delElement = arr[top];
                top--;
            }
            return delElement;
        }

        int peek(){
            int topElement=0;
            if(top<p){
                System.out.println("Empty Stack");
            } else {
                topElement = arr[top];
            }
            return topElement;
        }

        void display(){
            if(top < p){
                System.out.println("Empty Stack");
            } else {
                int i = top;
                System.out.println("Stack Elements are:");
                while(i>=p){
                    System.out.print(arr[i]+ " ");
                    i--;
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        twoStackInArray stack1 = new twoStackInArray(0,2);
        twoStackInArray stack2 = new twoStackInArray(3,5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        System.out.println("Peek Stack 1: "+ stack1.peek());
        System.out.println("Peek Stack 2: "+ stack2.peek());
        stack1.display();
        stack2.display();
        System.out.println("Pop Stack 1: "+ stack1.pop());
        System.out.println("Pop Stack 2: "+ stack2.pop());
        stack1.display();
        stack2.display();
    }
}
