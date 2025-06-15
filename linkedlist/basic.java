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

  void insertathead(int val){
    node temp=new node(val);
    if(head==null){
      head=temp;
      tail=temp;
    }
    else{
    temp.next=head;
    head=temp;
  }
    size++;
  }

  void insertatany(int pos,int val){
    node temp = new node(val);
    int idx=1;
    node x= head;
    while(idx<pos){
      
      x=x.next;
      idx++;
    }
    temp.next=x.next;
    x.next=temp;
    
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
    System.out.println();
    s.insertathead(5);
    s.insertathead(40);
    s.print();
    System.out.println();
    s.insertatany(3,60);
    s.print();

    


  }
}