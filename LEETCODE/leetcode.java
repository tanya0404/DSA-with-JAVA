// package LEETCODE;

// public class leetcode {
    
// }

// leetcode 704 binary search

// class Solution {
//     public int search(int[] nums, int target) {
//         int slow=0;
//         int fast=nums.length-1;
//         while(slow<=fast){
//         int mid=(slow+fast)/2;
//             if(target>nums[mid]){
//                 slow=mid+1;
//             }
//             else if(target==nums[mid]) return mid;
//             else{
//                 fast=mid-1;
//             }
//         }
//         return -1;
//     }
// }





// Solution 2 (using recursion)


// class Solution {
//     public int search(int[] nums, int target) {
//         int s=0;
//         int f=nums.length-1;
//         return search(nums,target,s,f);
//     }

//     public static int search(int[] arr, int t, int s, int f){
//         if (s > f) return -1;
//         int mid = s + (f - s) / 2;


//         if(t== arr[mid]) return mid;

//         if(t<arr[mid]) return search(arr, t, s, mid-1);

//         else return search(arr, t,mid+1, f);

//     }
// }



// factorial of a number using recursion
// class Solution {
//     static int factorial(int n) {
//     if(n<=1) return 1;
//     return n*factorial(n-1);
        
//     }
// }




// Sum Of Digits
// class Solution {
//     static int sumOfDigits(int n) {
//         // int sum=0;
//         // while(n!=0){
//         //     int digit=n%10;
//         //     sum=sum+digit;
//         //     n=n/10;
//         // }
//         //  return sum;
        
//         int digit=n%10;
//         if(n==0) return 0;
        
//         return digit+sumOfDigits(n/10);
            
        
        
//     }
// }
