package com.company;

class InsertBottomStack{
    Stack insertIntoStack(Stack stack, int element){
        Stack tempStack = new Stack(stack.size());

        while(!stack.isEmpty()){
            tempStack.push(stack.pop());
        }
        stack.push(element);
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        return stack;
    }

    Stack recursiveInsertIntoStack(Stack stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return stack;
        }
        int x = stack.pop();
        stack = recursiveInsertIntoStack(stack, element);
        stack.push(x);
        return stack;
    }
}

/*
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        InsertBottomStack s = new InsertBottomStack();
        stack = s.recursiveInsertIntoStack(stack,0);
        stack.display();
 */