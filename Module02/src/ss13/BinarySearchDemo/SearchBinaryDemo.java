package ss13.BinarySearchDemo;

import java.util.Random;

public class SearchBinaryDemo {
    public static void main(String[] args) {

        int [] arr = new int[20];
        Random random = new Random(100);

    }

    public static  int search( int [] arr ,int x){
        int low = 0, high =arr.length-1,  mid = (low + high)/2;
        while (low <= high){
            if( arr[mid] == x ){
                return  mid;
            }
            else if ( arr[mid] > x){
                high = mid  - 1;
                mid = ( low +high) /2;
            }
            else {
                low = mid + 1;
                mid = ( low +high) /2;
            }
        }
        return -1;
    }


 /*   public int search2( int [] arr, int low, int high, int n){
        if( low> high) return -1;
        int mid = ( low  + high) /2;

        if

    }*/
}
