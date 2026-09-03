package SORTING;

public class Union1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,1,2,4,6};
        int l = 0;
        int mid = (arr.length/2)-1;
        int r = mid+1;
        int [] arr2 = new int [arr.length];
        int in = 0;

        while(l <= mid && r < arr.length){
            if(arr[l] <= arr[r]){
                
                arr2[in] = arr[l];
                l++;
                in++;
            }
            else{
                arr2[in] = arr[r];
                r++;
                in++;

            }
        }
        while (l<=mid) {
            arr2[in]=arr[l];
            in++;
            l++;
        }while (r<arr.length-1) {
            arr2[in]=arr[r];
            in++;
            r++;
        }
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
