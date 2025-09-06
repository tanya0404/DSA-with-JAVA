// package Array;

import java.util.ArrayList;
import java.util.Arrays;

import Array.array;

public class GFG {
  
    
    
    
    //  element in array
    
    // class Solution {
//     public static int largest(int[] arr) {
    //         int slow=0;
    //         int fast=1;
//         int max= Integer.MIN_VALUE;
//         while(fast<arr.length){
//             if(arr[slow]>max) max=arr[slow];
//             if(arr[fast]>max) max= arr[fast];
            

//             slow++;
//          Largest   fast++;
//         }
//         return max;
//     }
// }






//CEIL OF A SORTED ARRAY 

// class Solution {
    //     public int findCeil(int[] arr, int x) {
        //         int s=0;
        //         int e=arr.length-1;
        //         int ans=-1;
        //         while(s<=e){
            //         int mid=s+(e-s)/2;
            
            //         if(x>arr[mid]){
                //             s=mid+1;
                //         }
                //         else{
                    //             ans=mid;
                    //             e=mid-1;
                    //         }
                    //         }
                    //         return ans;
        
//     }
// }








// FLOOR OF A SORTED ARRAY

// class Solution {
    //     public int findFloor(int[] arr, int x) {
        //         int s=0;
        //         int e=arr.length-1;
        //         int ans=-1;
        //         while(s<=e){
            //             int mid=s+(e-s)/2;
            //             if(x>=arr[mid]){
                //                 ans=mid;
                //                 s=mid+1;
                //             }
                //             else{
                    //                 e=mid-1;
                    //             }
//         }
//         return ans;
//     }
// }








//      Find position of an element in a sorted array of infinite numbers


public static int idx(int[] arr,int k){
        int s=0;
        int e=1;

        while(e<arr.length && arr[e]<k){
            int temp=e+1;
            e=e+(e-s+1)*2;
            s=temp;
        }
        return find(arr, k, s, e);
}
public static int find(int[] arr, int k,int s,int e){
    while(s<=e){
        int mid=s+(e-s)/2;

        if(k==arr[mid])  return mid;

        else if(k>arr[mid]) s=mid+1;

        else{ e=mid-1;}
    }
    return -1;
    
}
public static void main(String[] args) {
    int[] arr={12,33,42,55,67,84,90,150,163,170,211};
    int k = 170;
    int ans=idx(arr, k);
    System.out.println(ans);
}



}