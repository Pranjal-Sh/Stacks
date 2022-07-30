package com.company;

class Queue{
    int front=-1, rear=-1;
    int[] arr = new int[5];

    void enqueue(int data){
        if(rear>=arr.length-1){
            System.out.println("Queue if full");
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