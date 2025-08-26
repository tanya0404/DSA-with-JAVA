
import java.util.*;
public class leetcode {
    

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
//         
//         int digit=n%10;
//         if(n==0) return 0;

//         return digit+sumOfDigits(n/10);



//     }
// }




                            //  REVERSE A NUMBER


// static int sum =0;
// public static int reverse(int n){
//     if(n==0) return 0;
//     int digit=n%10;
//     sum=sum*10+digit;
//     return reverse(n/10);
// }
// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     int n=s.nextInt();
//     reverse(n);
//     System.out.println(sum);
// }

//  OR

//  class Solution {
//     public static int helper(int x, int rev){
//         if(x == 0) return rev;
//         if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) return 0;
//         rev = rev*10 + x % 10;
//         return helper(x/10, rev);
//     }
//     public int reverse(int x) {
//         return helper(x, 0);
//     }
// }



                            //  PALINDROME NUMBER

// class Solution {
//     public boolean isPalindrome(int x) {
//         int r=reverse(x,0);
//        if(x<0){
//              return false;
//        }
//         else if(x==r){
//              return true;
//         }
//         else {
//             return false;
//         }
//     }

//     public int reverse(int x,int sum){
//         if(x==0) return sum;
//         int digit=x%10;
//         sum=sum*10+digit;
//         return reverse(x/10,sum);
//     }
// }


                            //   NUMBER OF STEPS


// class Solution {
//     public int numberOfSteps(int num) {
//         return fun(num,0);
//     }
//     public int fun(int n,int c){
//         if(n==0) return c;
//         if(n%2==0) {
//             n=n/2;
//             c++;
//         }
//         if(n%2!=0) {
//             n=n-1;
//             c++;
//         }
//         return fun(n,c);
//     }
// }


                            //  ARRAY IS SORTED OR NOT


// class Solution {
//     public boolean isSorted(int[] arr) {
//         return helper( arr,0);
        
//     }
//     public boolean helper(int[] arr,int i){
//         if(i==arr.length-1) return true;
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
//         return helper(arr,i+1);
//     }
// }      





                                // REVERSE AN ARRAY

// public static void reverse(int[] arr,int s,int e){
//     if(s>=e) return;
//     int temp=arr[s];
//     arr[s]=arr[e];
//     arr[e]=temp;
//     reverse(arr,s+1,e-1);

// }

// public static void main(String[] args) {
//     int arr[]= {1,2,3,4,5};
//     int s=0;
//     int e=arr.length-1;
//     reverse(arr,s,e);

//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
// }







                                // STRING IS PALINDROME 

// public static boolean isPalindrome(char[] arr,int s,int e){
//     if(s>=e) return true;
//     if(arr[s]!=arr[e]){
//         return false;
//     }
//         return isPalindrome(arr,s+1,e-1);
    

// }

// public static void main(String[] args) {
//     Scanner s=new Scanner(System.in);
//     String st= s.nextLine();
//     char arr[] = st.toCharArray();
//     // for(char x: arr)System.out.println(x+" ");
//     int start=0;
//     int e=arr.length-1;

//     boolean ans = isPalindrome(arr,start,e);
//     System.out.println(ans);

// }




// public static void remove_a(char[] arr){
//     StringBuilder str=new StringBuilder();
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]!='a') str.append(arr[i]);
//     }
//     System.out.println(str);
// }

public static String remove_a(char[] arr,int s,StringBuilder str){
    if(s==arr.length) return str.toString();
    if(arr[s]!='a') str.append(arr[s]);
    return remove_a(arr, s+1, str);
}


public static void main(String[] args) {
    StringBuilder str=new StringBuilder();
    Scanner s=new Scanner(System.in);
    String st= s.nextLine();
    char arr[] = st.toCharArray();
    System.out.println(remove_a(arr,0,str));
}

}