public class basic {
public static class node{
    int data;
    node left;
    node right;

    node(int data){
        this.data=data;
    }
}

    public static void display(node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        node a=new node(10);
        node b=new node(30);
        node c=new node(20);
        node d=new node(40);
        node e=new node(70);
        node f=new node(90);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;

        display(a);

}

}
