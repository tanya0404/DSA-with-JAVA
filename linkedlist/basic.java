public class basic{

static class node{
  int val;
  node next;

  node(int val){
    this.val=val;
  }
}

static class sll{
  node head=null;
  node tail=null;
  int size=0;

  void insertattail(int val){
    node temp=new node(val);
    if(head==null){
      head=temp;
      tail=temp;
    }
    else{
    tail.next=temp;
    tail=temp;
  }
    size++;
  }

  void print(){
    node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
  }
}

  public static void main(String[] args) {
    sll s=new sll();
    s.insertattail(10);
    s.insertattail(12);
    s.insertattail(15);
    s.print();
    

    


  }
}