// package Array;

// public class leetcode {
  
// }


// 1752. Check if Array Is Sorted and Rotated


// class Solution {
//     public boolean check(int[] nums) {
//         int count = 0;
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             if (nums[i] > nums[(i + 1) % n]) {
//                 count++;
//             }
//         }

//         return count <= 1;
//     }
// }



// 26. Remove Duplicates from Sorted Array


// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int i = 1, j = 1;
//        while(j < nums.length){
//         if(nums[j] == nums[j-1])j++;
//         else {
//             nums[i] = nums[j];
//             i++;
//             j++;
//         }
//        }
//        return i;
//     }
// }




// 1281. Subtract the Product and Sum of Digits of an Integer

// class Solution {
//     public int subtractProductAndSum(int n) {
//         int sum=0;
//         int pro=1;

//         while(n>0){
//             int digit=n%10;
//             sum+=digit;
//             pro=pro*digit;
//             n=n/10;
//         }
//         int ans=pro-sum;
//         return ans;
//     }
// }




// 191. Number of 1 Bits

// class Solution {
//     public int hammingWeight(int n) {
//         int count=0;
//         while(n>0){
//             int ldigit=n%2;
//             if(ldigit==1) count++;
//             n=n/2;
//         }
//         return count;
//     }
// }



// 704. Binary Search


// class Solution {
//     public int search(int[] nums, int target) {
//         int slow=0;
//         int fast=nums.length-1;
//         while(slow<=fast){
//         int mid=(slow+fast)/2;
//         if(target==nums[mid]) return mid;
//         else if(target<nums[mid]){
//             fast=mid-1;
//         }
//         else{
//             slow=mid+1;
//         }
//         }
//         return -1;
        
//     }
// }




// 189. Rotate Array

// class Solution {
//     void swap(int[] nums,int l,int h){
//         while(l<h){
//             int temp=nums[l];
//             nums[l]=nums[h];
//             nums[h]=temp;
//             l++;
//             h--;
//         }
//         }

//     public void rotate(int[] nums, int k) {
//         int n = nums.length;

//         if (n <= 1 || k == 0) return;

//         k = k % n;
//         swap(nums,0,n-1);
//         swap(nums,0,k-1);
//         swap(nums,k,n-1);
        
//     }
// }






//     744. Find Smallest Letter Greater Than Target

// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int s=0;
//         int e=letters.length-1;
//         int ans=0;
//         while(s<=e){
//             int mid=s+(e-s)/2;

//             if(letters[mid] > target){
//                 ans=mid;
//                 e=mid-1;
//             }
//             else{
//                 s=mid+1;
//             }
//         }
//         return letters[ans];
//     }
// }







//        34. Find First and Last Position of Element in Sorted Array

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int s=0;
//         int e=nums.length-1;
//         int i=-1;
//         int j=-1;

//         while(s<=e){
//             int mid=s+(e-s)/2;
//             if(target>nums[mid]){
//                 s=mid+1;
//             }
//             else if(target<nums[mid]){
//                 e=mid-1;
//             }
//             else{
//                 i=mid; 
//                 j=mid;
//                 while(i>0 && nums[i-1]==target){
//                     i--;
//                 }
//                 while(j<e && nums[j+1]==target){
//                     j++;
//                 }
//                 break;
//             }
//         }
//         return new int[]{i,j};
//     }
//     }




//       852. Peak Index in a Mountain Array

// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {

        //   BASIC APPROCH

    //     int i=0;
    //     int j=1;
    //     int ans=0;
    //     while(j<arr.length-1){
    //         if(arr[i]<arr[j]){
    //             ans=j;
    //             i++;
    //             j++;
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     return ans;
    // }


    //    BS APPROCH OPTIMIZED

//     int s=0;
//     int e=arr.length-1;

//     while(s<e){
//         int mid =s+(e-s)/2;
//         if(arr[mid]>arr[mid+1]){
//             e=mid;
//         }
//         else{
//             s=mid+1;
            
            
//         }
//     }
//     return e;

//     }
// }