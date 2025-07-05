package Array;

import java.util.*;
public class array {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }

                  // BUBBLE SORT

    // for(int i=0;i<n;i++){
    //   for(int j=0;j<n-i-1;j++){
    //     if(arr[j]>arr[j+1]){
    //       int temp=arr[j];
    //       arr[j]=arr[j+1];
    //       arr[j+1]=temp;
    //     }

    //   }
    // }


                  // SELECTION SORT 

    // for(int i=0;i<n;i++){
    //   int min=i;
    //   for(int j=i+1;j<n;j++){
    //     if(arr[min]>arr[j]){
    //       min=j;
    //     }
    //   }
    //   int temp=arr[i];
    //   arr[i]=arr[min];
    //   arr[min]=temp;
    // }


                  //  INSERTION SORT

  //   for(int i=0;i<n;i++){
  //     for(int j=0;j<n-i-1;j++){
  //       if(arr[j]>arr[j+1]){
  //       int temp=arr[j];
  //       arr[j]=arr[j+1];
  //       arr[j+1]=temp;
  //     }
  //   }
  // }


  // for(int i=0;i<n;i++){
  //   int min=i;
  //   for(int j=i+1;j<n;j++){
  //     if(arr[j]<arr[min]) min=j;
      
  //   }
  //   int temp=arr[i];
  //   arr[i]=arr[min];
  //   arr[min]=temp;
  // }

  


    // for(int i=0;i<n;i++){
    //   System.out.print(arr[i]+" ");
    // }




    int ans[]= new int[n];

    for(int i=0;i<n;i++){
      boolean flag=false;
      for(int j=i+1;j<n;j++){
        if(arr[i]<arr[j]){
          ans[i]=arr[j];
          flag=true;
          break;
        }
      }
      if (!flag) {
        ans[i]=-1;
      }
      
      
  }
  for(int k=0;k<n;k++) System.out.print(ans[k]+" ");
}
}


