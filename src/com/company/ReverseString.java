package com.company;

class ReverseString {
    String reverseString(String string){
        StringStack stack = new StringStack(string.length());
        String reverse = "";

        for(int i=0; i<string.length();i++){
            stack.push(string.charAt(i));
        }

        for(int i=0; i<string.length();i++){
            reverse += stack.pop();
        }
        return reverse;
    }
}

/*
        String string = "Hello World!";
        ReverseString reverseString = new ReverseString();

        System.out.println("Reverse string is: "+ reverseString.reverseString(string));
*/
