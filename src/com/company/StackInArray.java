package com.company;

class StackInArray {
    int p, r, top;
    int arr[] ;

    StackInArray(int p,int r, int[] arr){
        this.p = p;
        this.r = r;
        this.top = p-1;
        this.arr = arr;
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

/*
        int[] arr = new int[6];
        StackInArray stack1 = new StackInArray(0,1,arr);
        StackInArray stack2 = new StackInArray(2,3, arr);
        StackInArray stack3 = new StackInArray(4,5, arr);
        stack1.push(1);
        stack1.push(2);
        stack2.push(3);
        stack2.push(4);
        stack3.push(5);
        stack3.push(6);
        System.out.println("Peek Stack 1: "+ stack1.peek());
        System.out.println("Peek Stack 2: "+ stack2.peek());
        System.out.println("Peek Stack 3: "+ stack3.peek());
        stack1.display();
        stack2.display();
        stack3.display();
        System.out.println("Pop Stack 1: "+ stack1.pop());
        System.out.println("Pop Stack 2: "+ stack2.pop());
        System.out.println("Pop Stack 3: "+ stack3.pop());
        stack1.display();
        stack2.display();
        stack3.display();
 */