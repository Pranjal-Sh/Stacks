package com.company;

import java.util.Stack;

class MaxAreaHistogram{
    int[] hist;
    java.util.Stack<Integer> stack = new Stack<>();

    MaxAreaHistogram(int[] hist){
        this.hist = hist;
    }

    int maxArea(){
        int maxArea=hist[0], area;
        int i =0;
        while(i<hist.length){
            if(stack.isEmpty() || hist[stack.peek()]<=hist[i]){
                stack.push(i++);
            } else {
                area = getArea(i);
                maxArea = Math.max(area,maxArea);
            }
        }

        while(!stack.isEmpty()){
            area = getArea(i);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }

    int getArea(int i){
        int top = stack.pop();
        return hist[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
    }
}

/*
        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
        MaxAreaHistogram histogramArea = new MaxAreaHistogram(hist);
        System.out.println(histogramArea.maxArea());
 */
