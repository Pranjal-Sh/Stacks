package com.company;

class GetMinStack{
    int top=-1;
    int minElement;
    int arr[] = new int[5];

    void push(int element){
        if(top>=arr.length){
            System.out.println("Stack Overflow");
        } else {
            if(top==-1){
                minElement = element;
            } else if(element<minElement){
                int prevMinElement = minElement;
                minElement = element;
                element = 2*minElement - prevMinElement;
            }
            top++;
            arr[top] = element;
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int delElement = arr[top];
            if(delElement <minElement){
                int temp = minElement;
                minElement = 2*minElement - delElement;
                delElement = temp;
            }
            top--;
            return delElement;
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

    void getMinimum(){
        System.out.println("Min element is: "+minElement);
    }
}

/*
        GetMinStack stack = new GetMinStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.getMinimum();
        stack.display();
        System.out.println("Deleted Element: "+stack.pop());

        stack.getMinimum();

        System.out.println("Deleted Element: "+stack.pop());
        stack.getMinimum();
        System.out.println("Deleted Element: "+stack.pop());
        stack.getMinimum();
        System.out.println("Deleted Element: "+stack.pop());
        stack.getMinimum();
 */