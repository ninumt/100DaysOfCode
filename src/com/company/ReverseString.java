package com.company;

/**
 * Created by thoni82 on 12/31/17.
 */
public class ReverseString {

    public static String reverse(String word){
        StringBuffer sb=new StringBuffer();
        int len=word.length();
        for(int i=0;i< len;i++){
            sb.append(word.charAt(len-1-i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println(reverse("apple is a fruit"));
    }
}
