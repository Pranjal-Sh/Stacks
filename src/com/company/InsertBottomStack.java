package com.company;

class InsertBottomStack{
    Stack insertAtBottom(Stack stack, int element){
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

    Stack recursiveInsertAtBottom(Stack stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return stack;
        }
        int x = stack.pop();
        stack = recursiveInsertAtBottom(stack, element);
        stack.push(x);
        return stack;
    }

    Stack reverseStack(Stack stack){
        if(stack.isEmpty()){
            return stack;
        } else {
            int temp = stack.pop();
            reverseStack(stack);
            return this.insertAtBottom(stack, temp);
        }
    }

    Stack sortStack(Stack stack, boolean isAscending){
        if(!stack.isEmpty()){
            int temp = stack.pop();
            sortStack(stack, isAscending);
            if(isAscending)
                return sortedInsertion(stack, temp);
            else
                return descSortedInsertion(stack, temp);
        }
        return stack;
    }

    Stack sortedInsertion(Stack stack, int element){
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
            return stack;
        } else {
            int temp = stack.pop();
            stack = sortedInsertion(stack, element);
            stack.push(temp);
            return stack;
        }
    }

    Stack descSortedInsertion(Stack stack, int element){
        if(stack.isEmpty() || stack.peek()>=element){
            stack.push(element);
            return stack;
        } else {
            int temp = stack.pop();
            stack = descSortedInsertion(stack, element);
            stack.push(temp);
            return stack;
        }
    }
}

/* To insert at bottom
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        InsertBottomStack s = new InsertBottomStack();
        stack = s.recursiveInsertIntoStack(stack,0);
        stack.display();
 */

/*To sort in descending order
        Stack stack = new Stack(5);
        stack.push(12);
        stack.push(65);
        stack.push(46);
        stack.push(-63);
        stack.push(523);

        InsertBottomStack s = new InsertBottomStack();
        stack = s.sortStack(stack, false);
        stack.display();
 */