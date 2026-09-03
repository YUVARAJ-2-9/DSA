package STRINGS;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        String str = "banana";
        // char [] arr = str.toCharArray();
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i] == arr[j] ){
        //             System.out.println(arr[i]);
        //             arr[j] = ' ';
        //             break;
        //         }
        //     }
        // }

        int [] arr = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 1){
                System.out.println(ch);
            }
            arr[ch] ++ ;
        }
        }
    }
