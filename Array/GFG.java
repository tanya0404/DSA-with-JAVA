// package Array;

// public class GFG {
  
// }



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






