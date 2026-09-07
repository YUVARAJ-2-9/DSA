package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values:");
        int n = in.nextInt();
        ArrayList <Integer> li = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            li.add(in.nextInt());
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < li.size(); i++) {
           int cur = li.get(i);
           if(cur > max){
                smax = max;
                max = cur;
           }
           else if(cur > smax && cur < max){
            smax = cur;
           }
        }
        System.out.println(smax);

    }
}
