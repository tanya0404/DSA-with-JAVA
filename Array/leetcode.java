// package Array;

// public class leetcode {
  
// }


1752. Check if Array Is Sorted and Rotated


class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}



26. Remove Duplicates from Sorted Array


class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 1;
       while(j < nums.length){
        if(nums[j] == nums[j-1])j++;
        else {
            nums[i] = nums[j];
            i++;
            j++;
        }
       }
       return i;
    }
}




1281. Subtract the Product and Sum of Digits of an Integer

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;

        while(n>0){
            int digit=n%10;
            sum+=digit;
            pro=pro*digit;
            n=n/10;
        }
        int ans=pro-sum;
        return ans;
    }
}
