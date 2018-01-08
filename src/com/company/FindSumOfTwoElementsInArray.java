package com.company;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by thoni82 on 1/6/18.
 */

    public class FindSumOfTwoElementsInArray {
        //Logic 3 best
        //Logic 1- look in array if you find no which you get after you do(Sum - (go thru each element in array))
        public static void findNos(int[] arr, int sum){
            for(int i=0;i<arr.length;i++){
                for(int j=1;j<arr.length;j++) {
                    if (arr[i] == (sum - arr[j]))
                        System.out.println(arr[i]+":"+arr[j]);
                }
            }

        }

        //logic 2- Sort the array.
        //then take left most as left and right most element as right
        //if left+right> sum .decrease right element (right--)
        //if left_+right<sum increase left elemeny

        public static void findNos2(int[] arr, int sum){
            Arrays.sort(arr);
            int len=arr.length;
            for(int l=0, r=len-1;l<len;l++){
                if(arr[l]+arr[r] > sum){
                    r--;
                }
                else if(arr[l]+arr[r] < sum){
                    l++;
                }
                else if(arr[l]+arr[r]== sum){
                    System.out.println(arr[l]+":"+arr[r]);
                }
            }
        }


        //Logic 3 -Using HashMap
        //iterate thru each element in array and perform sum- each element in array
        //check if you have that number in hashmap. if yes you got result
        //else put the number in hashmap.

        public static void printPair(int arr[],int sum) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            int i;
            int remainingSum;

            for (i = 0; i < arr.length; i++) {
                remainingSum = sum - arr[i];
                if (hash.containsValue(remainingSum)) {
                    System.out.println("pair:=" + arr[i] + "," + remainingSum);
                }
                hash.put(i, arr[i]);

            }

        }

        public static void main(String[] args){
            //findNos(new int[]{5,1,3,10,4,6,3,-1}, 9 );
            //findNos2(new int[]{5,1,3,10,4,6,-1}, 9 );
            printPair(new int[]{5,1,3,10,4,6,-1} ,9);
        }
}
