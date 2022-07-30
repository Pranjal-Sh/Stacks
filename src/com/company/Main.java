package com.company;

public class Main {
    public static void main(String[] args) {
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
    }
}
