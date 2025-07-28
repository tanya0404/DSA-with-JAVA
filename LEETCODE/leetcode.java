// package LEETCODE;

// public class leetcode {
    
// }

leetcode 704 binary search

class Solution {
    public int search(int[] nums, int target) {
        int slow=0;
        int fast=nums.length-1;
        while(slow<=fast){
        int mid=(slow+fast)/2;
            if(target>nums[mid]){
                slow=mid+1;
            }
            else if(target==nums[mid]) return mid;
            else{
                fast=mid-1;
            }
        }
        return -1;
    }
}
