package com.company;

/**
 * Created by thoni82 on 12/31/17.
 */
public class ReverseEachWordInPlace {
    public static String reverseEachWord(String word){
        String[] arr=word.split(" ");
        StringBuffer sb=new StringBuffer();

        int len=word.length();
        for(int i=0;i<len;i++){
            System.out.print(reverse(arr[i])+" ");
        }

        return sb.toString().trim();
    }


    public static String reverse(String word){
        StringBuffer sb=new StringBuffer();
        int len=word.length();
        for(int i=0;i< len;i++){
            sb.append(word.charAt(len-1-i));
        }
        return sb.toString();
    }

    public static String reverseInPlace(String sentence){
        char[] ch=sentence.toCharArray();
        int len=ch.length;
        String res="";
        for(int i=0;i<len; i++){
             res=res+ch[len-1-i];
            }
            return res;
        }

    public static String reverseString(String s){
        return new StringBuffer( s ).reverse().toString();
    }

    public static void main(String[] args){
        //System.out.println(reverseEachWord("1 apple  is a fruit"));
        System.out.println(reverseInPlace("1 apple  is a fruit"));
        System.out.println(reverseString("apple banana come"));
    }
}
