package com.company;

class NextGreaterElement{
    void nge(int[] arr){
        int n=arr.length;
        Stack stack = new Stack();

        stack.push(arr[0]);
        int next,element;

        System.out.println("Next Greater Element for each item is: ");
        for(int i=1; i<n;i++){
            next = arr[i];
            if(!stack.isEmpty()){
                element = stack.pop();
                while(element<next){
                    System.out.println(element + "-->" + next);
                    if(stack.isEmpty()){
                        break;
                    }
                    element = stack.pop();
                }
                if(element>=next){
                    stack.push(element);
                }
            }
            stack.push(next);
        }

        while(!stack.isEmpty()){
            element = stack.pop();
            next = -1;
            System.out.println(element + "-->" + next);
        }
    }

    void reverseNGE(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack stack = new Stack();

        for(int i=n-1;i>=0; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek()<arr[i]){
                    stack.pop();
                }
            }

            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        System.out.println("Next Greater Element is: ");
        for(int i=0; i<n;i++){
            System.out.println(arr[i] + "-->" + nge[i]);
        }
    }
}

/*
        int[] arr = {5,8,2,10,7};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        nextGreaterElement.reverseNGE(arr);
*/