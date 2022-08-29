package com.company;

class StackWithQueue{
    Queue q1 = new Queue();
    Queue q2 = new Queue();

    void push1(int element){
        if(q1.isFull()){
            System.out.println("Queue is Full");
        } else {
            q2.enqueue(element);
            while(!q1.isEmpty()){
                q2.enqueue(q1.dequeue());
            }
            Queue temp = q1;
            q1 = q2;
            q2 = temp;
        }
    }

    int pop1(){
        if(q1.isEmpty()){
            return -1;
        } else {
            return q1.dequeue();
        }
    }
}

/*
        StackWithQueue stack = new StackWithQueue();
        stack.push1(1);
        stack.push1(2);
        stack.push1(3);
        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
        System.out.println(stack.pop1());
 */
