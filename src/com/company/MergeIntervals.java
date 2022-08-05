package com.company;

import java.util.Arrays;
import java.util.Comparator;

class Interval{
    int start;
    int end;

    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}

class MergeIntervals{
    void mergeIntervals(Interval[] arr){
        IntervalStack stack = new IntervalStack(arr.length);
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        stack.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            Interval top = stack.peek();

            if(top.end>=arr[i].start){
                top.end = Math.max(arr[i].end,top.end);
                stack.pop();
                stack.push(top);
            } else {
                stack.push(arr[i]);
            }
        }

        Interval temp;
        while(!stack.isEmpty()){
            temp = stack.pop();
            System.out.println("("+temp.start+", "+temp.end+")");
        }
    }

    void inplaceMerge(Interval[] arr){

        Arrays.sort(arr, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });

        int index = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[index].end>=arr[i].start){
                arr[index].end = Math.max(arr[i].end, arr[index].end);
            } else {
                index++;
                arr[index] = arr[i];
            }
        }

        for(int i=0; i<=index; i++){
            System.out.println("("+arr[i].start+", "+arr[i].end+")");
        }
    }
}

class IntervalStack{
    int top;
    Interval[] arr;

    IntervalStack(int size){
        this.top =-1;
        this.arr = new Interval[size];
    }

    void push(Interval element){
        if(top==arr.length-1){
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = element;
        }
    }

    Interval pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return new Interval(0,0);
        } else {
            Interval delElement = arr[top];
            top--;
            return delElement;
        }
    }

    Interval peek(){
        if(top<0){
            System.out.println("Stack is Empty");
            return new Interval(0,0);
        } else {
            return arr[top];
        }
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        } else {
            return false;
        }
    }
}

/*
        Interval[] arr = new Interval[6];
        arr[0] = new Interval(2,4);
        arr[1] = new Interval(1,3);
        arr[2] = new Interval(4,5);
        arr[3] = new Interval(7,9);
        arr[4] = new Interval(9,10);
        arr[5] = new Interval(11,13);

        MergeIntervals merger = new MergeIntervals();
        merger.inplaceMerge(arr);
 */