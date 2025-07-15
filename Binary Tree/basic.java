public class basic {
// public static class node{
//     int data;
//     node left;
//     node right;

//     node(int data){
//         this.data=data;
//     }
// }

//     public static void display(node root){
//         if(root==null) return;
//         System.out.print(root.data+" ");
//         display(root.left);
//         display(root.right);
//     }

//     public static void main(String[] args) {
//         node a=new node(10);
//         node b=new node(30);
//         node c=new node(20);
//         node d=new node(40);
//         node e=new node(70);
//         node f=new node(90);

//         a.left=b;a.right=c;
//         b.left=d;b.right=e;
//         c.right=f;

//         display(a);

// }








// public static class node{
//     int data;
//     node left;
//     node right;

//     node(int data){
//         this.data=data;
//     }
// }

//     public static int displaysum(node root){
//         int sum =0;
//         if(root==null) return 0;
//         sum = root.data+displaysum(root.left)+displaysum(root.right);
//         return sum;
//     }

//     public static void main(String[] args) {
//         node a=new node(10);
//         node b=new node(30);
//         node c=new node(20);
//         node d=new node(40);
//         node e=new node(70);
//         node f=new node(90);

//         a.left=b;a.right=c;
//         b.left=d;b.right=e;
//         c.right=f;

//         System.out.println(displaysum(a));

// }







// public static class node{
//     int data;
//     node left;
//     node right;

//     node(int data){
//         this.data=data;
//     }
// }

//     public static int displayproduct(node root){
//         int product=1;
//         if(root==null) return 1;
//         if(root.data!=0){
//             product=root.data*displayproduct(root.left)*displayproduct(root.right);
//         }else{
//             product=displayproduct(root.left)*displayproduct(root.right);
//         }
//         return product;
//     }

//     public static void main(String[] args) {
//         node a=new node(1);
//         node b=new node(0);
//         node c=new node(2);
//         node d=new node(4);
//         node e=new node(7);
//         node f=new node(9);

//         a.left=b;a.right=c;
//         b.left=d;b.right=e;
//         c.right=f;

//         System.out.println(displayproduct(a));

// }






// public static class node{
//     int data;
//     node left;
//     node right;

//     node(int data){
//         this.data=data;
//     }
// }

//     static int max=Integer.MIN_VALUE;
//     public static void displaymax(node root){
//         if(root==null) return;
//         if(root.data>max) max=root.data;
//         displaymax(root.left);
//         displaymax(root.right);

//     }

//     public static void main(String[] args) {
//         node a=new node(1);
//         node b=new node(3);
//         node c=new node(2);
//         node d=new node(4);
//         node e=new node(7);
//         node f=new node(9);

//         a.left=b;a.right=c;
//         b.left=d;b.right=e;
//         c.right=f;

//         displaymax(a);
//         System.out.println(max);

// }










public static class node{
    int data;
    node left;
    node right;

    node(int data){
        this.data=data;
    }
}

public static int displaysize(node root){
        
        if (root==null) return 0;
        return 1+displaysize(root.left)+displaysize(root.right);

    }

    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(3);
        node c=new node(2);
        node d=new node(4);
        node e=new node(7);
        node f=new node(9);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;

        System.out.println(displaysize(a));
        

}




}
