package com.company;

class CelebrityProblem{
    int[][] arr;

    CelebrityProblem(int[][] arr){
        this.arr = arr;
    }
    boolean knows(int i,int j){
        return arr[i][j]==1 ? true : false;
    }

    int celebrity(){
        int n = arr.length;
        Stack stack = new Stack();

        for(int i=0; i<n ; i++){
            stack.push(i);
        }

        int i,j;

        while(stack.size()>1){
            i = stack.pop();
            j = stack.pop();

            if(knows(i,j)){
                stack.push(j);
            } else {
                stack.push(i);
            }
        }

        int potentialCelebrity = stack.pop();
        for(int k=0; k<n;k++){
            if(k!=potentialCelebrity){
                if(!knows(k,potentialCelebrity) || knows(potentialCelebrity,k)){
                    return -1;
                }
            }
        }

        return potentialCelebrity;
    }
}

/*
        int[][] arr = { {0,1,1,0},
                        {1,0,1,1},
                        {0,1,0,0},
                        {0,1,1,0}};
        CelebrityProblem celebrityProblem = new CelebrityProblem(arr);
        int celeb = celebrityProblem.celebrity();
        if(celeb == -1){
            System.out.println("No Celebrity Exists");
        } else {
            System.out.println("Celebrity is: " + (celeb+1));
        }
*/