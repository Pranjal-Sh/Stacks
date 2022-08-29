package com.company;

public class Halindrome {
    int halindrome(int n, String[] string){
        int count =0;
        for(int i=0;i<n;i++){
            if(halindromeCheck(string[i],0,string[i].length()-1)){
                count++;
            }
        }
        return count;
    }

    boolean halindromeCheck(String s, int l, int r){
        int n = r-l+1;
        int mid = (l+r)/2;
        String string = "";

        if(r<s.length()-1 || l>0){
            for(int i=l;i<=r;i++){
                string+=s.charAt(i);
            }
        } else {
            string = s;
        }

        if(n<=2){
            return false;
        }

        if(palindrome(string)){
            return true;
        }

        if(n%2==0){
            if(halindromeCheck(s,l,mid)){
                return true;
            }
            if(halindromeCheck(s,mid+1,r)){
                return true;
            }
        } else {
            if(halindromeCheck(s,l,mid-1)){
                return true;
            }
            if(halindromeCheck(s,mid+1,r)){
                return true;
            }
        }
        return false;
    }

    boolean palindrome(String s){
        if(s.equals(reverse(s))){
            return true;
        } else {
            return false;
        }
    }

    String reverse(String string){
        String result = "";
        for (int i=string.length()-1; i>=0;i--){
            result+=string.charAt(i);
        }
        return result;
    }
}

/*
        Halindrome h = new Halindrome();
        String[] string = {
                "amfhma",
                "hellol",
                "swsHlog",
                "swst"
        };
        System.out.println(h.halindrome(4, string));
 */