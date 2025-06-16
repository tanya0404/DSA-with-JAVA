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

  void get(int pos){
    node temp = head;
    int idx=1;
    while(idx<=pos){
      
      temp=temp.next;
      idx++;
    }
    System.out.println(temp.val);

  }

  void set(int pos,int value){
    node temp=head;
    int idx=1;
    while(idx<=pos){
      temp=temp.next;
      idx++;
    }
    temp.val=value;
    
  }

  void deleteathead(){
    if(head!=null){
    head=head.next;
    size--;}
  }

  void deleteatany(int pos){
    if(pos==0){
      deleteathead();
      return;
    }
    if(pos!=0){
    node temp=head;
    int idx=1;
    while(idx<pos){
      temp=temp.next;
      idx++;
    }
  
    if(temp.next==tail){
      tail=temp;
      
    }
    temp.next=temp.next.next;
  }
  
  
  }

  void print(){
    node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    System.out.println();
  }
}

  public static void main(String[] args) {
    sll s=new sll();
    s.insertattail(10);
    s.insertattail(12);
    s.insertattail(15);
    s.print();
    
    s.insertathead(5);
    s.insertathead(40);
    s.print();
    
    s.insertatany(3,60);
    s.print();
    s.get(4);
    s.set(4,69);
    s.print();
    s.deleteathead();
    s.print();
    s.deleteatany(2);
    s.print();
    System.out.println(s.tail.val);
  }
}