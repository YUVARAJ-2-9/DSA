package SORTING;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] arr = {3,4,1,2,5,3,1,4,5};
        int low = 0;
        int high = arr.length-1;
        Merge obj = new Merge();
        obj.divid(arr, low, high);

        System.out.println("Final Sorted Array: " + Arrays.toString(arr));
    }

    void divid(int [] arr,int low,int high){
        if(low == high){
            return;
        }
        int mid = (low+high)/2;
        divid(arr, low, mid);
        divid(arr, mid+1,high);
        merge(arr, low, mid, high);
    }
    void merge(int [] arr,int low,int mid,int high){
        int [] temp = new int[arr.length];
        int l = low;
        int r = mid+1;
        int in = 0;

        while(l <= mid && r <= high) {
            if(arr[l] <= arr[r]){
                temp[in] = arr[l];
                l++; 
            }
            else{
                temp[in] = arr[r];
                r++;
            }
            in++;
        }
        while(l <= mid){
            temp[in] = arr[l];
            in++;
            l++;
        }
        while(r <= high){
            temp[in] = arr[r];
            in++;
            r++;
        }
       for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
