package com.company;

class Queue{
    int front=-1, rear=-1;
    int[] arr = new int[5];

    boolean isEmpty(){
        if(front>rear || front==-1){
            return true;
        } else {
            return false;
        }
    }

    boolean isFull(){
        if(rear>=arr.length-1){
            return true;
        } else {
            return false;
        }
    }

    void enqueue(int data){
        if(rear>=arr.length-1){
            System.out.println("Queue is full");
        } else {
            if(front==-1)
                front++;
            rear++;
            arr[rear] = data;
        }
    }

    int dequeue(){
        if(front>rear || front==-1){
            System.out.println("Queue is empty");
            return 0;
        } else {
            int delElement = arr[front];
            front++;
            return delElement;
        }
    }

    int peek(){
        if(front>rear || front==-1){
            System.out.println("Queue is empty");
            return 0;
        } else {
            return arr[front];
        }
    }

    void display(){
        if(front>rear || front==-1){
            System.out.println("Queue is empty");
        } else {
            int i = front;
            System.out.println("Queue Elements:");
            while(i<=rear){
                System.out.print(arr[i]+ " ");
                i++;
            }
            System.out.println("");
        }
    }
}

/*
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(7);
        queue.enqueue(2);
        System.out.println("Front Element is: "+ queue.peek());
        queue.display();
        System.out.println("Deleted Element is: "+ queue.dequeue());
        queue.enqueue(34);
        queue.enqueue(73);
        queue.enqueue(45);
        System.out.println("Front Element is: "+ queue.peek());
        queue.display();
        System.out.println("Deleted Element is: "+ queue.dequeue());
        System.out.println("Deleted Element is: "+ queue.dequeue());
        System.out.println("Deleted Element is: "+ queue.dequeue());
        System.out.println("Deleted Element is: "+ queue.dequeue());
        System.out.println("Deleted Element is: "+ queue.dequeue());
        queue.display();
 */