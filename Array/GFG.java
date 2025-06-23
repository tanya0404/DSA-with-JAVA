// package Array;

// public class GFG {
  
// }

1.Largest element in array

class Solution {
    public static int largest(int[] arr) {
        int slow=0;
        int fast=1;
        int max= Integer.MIN_VALUE;
        while(fast<arr.length){
            if(arr[slow]>max) max=arr[slow];
            if(arr[fast]>max) max= arr[fast];
            
            
            slow++;
            fast++;
        }
        return max;
    }
}

