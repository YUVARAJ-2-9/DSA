package SORTING;

public class Union {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] arr2 = {2,3,4,5};
        int [] arr3 = new int [arr.length + arr2.length];
       int l = 0;
       int r = 0;
       int ind = 0;

       
       while(arr[l] <= arr.length-1 && arr[r] <= arr2.length-1){
            if(arr[l] <=arr[r]){
                    arr3[ind] = arr[l];
                    l++;
                    ind++;
            }
            else{
                arr3[ind] = arr2[r];
                r++;
                ind++;
            }
       }
       while(l <= arr.length-1){
            arr3[ind] = arr[l];
            l++;
            ind++;
       }
       while(r <= arr2.length-1){
        arr3[ind] = arr2[r];
        r++;
        ind++;
       }

       for (int i : arr3) {
        System.out.println(i);
       }
    }
}
