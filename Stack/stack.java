package Stack;
import java.util.*;
public class stack {

  public static Stack<Integer> reverse(Stack<Integer> s){
    Stack<Integer> temp= new Stack<>();
    while(s.size()!=0){
    temp.push(s.pop());
    }
    return temp;
  }

  public static Stack<Integer> copy(Stack<Integer> s){
  
    Stack<Integer> temp=reverse(s);
    Stack<Integer> copy= new Stack<>();
    while(!temp.isEmpty()){
      copy.push(temp.pop());
    }
    return copy;
  }

  public static Stack<Integer> insertatbottom(Stack<Integer> s,int val){
    Stack<Integer> temp=new Stack<>();
    while(!s.isEmpty()){
      temp.push(s.pop());
    }
    Stack<Integer> ori=new Stack<>();
    ori.push(val);
    while(!temp.isEmpty()){
      ori.push(temp.pop());
    }
    return ori;
  }

  public static Stack<Integer> insertatany(Stack<Integer> s,int val,int pos){
    int size=s.size();        //lagana padega
    Stack<Integer> temp = new Stack<>();
    while(!s.isEmpty()){
      temp.push(s.pop());
    }

    Stack<Integer> ori=new Stack<>();
    for(int i=0;i<size+1;i++){
      if(i==pos) ori.push(val);
      else ori.push(temp.pop());
    }
    return ori;
  }

  

  public static void main(String[] args) {
    
  
  Stack<Integer> st=new Stack<>();
  st.push(1);
  st.push(2);
  st.push(3);
  st.push(4);
  st.push(5);
    // System.out.println(st);
  // System.out.println(reverse(st));
  // System.out.println(copy(st));
  // System.out.println(insertatbottom(st, 10));
  System.out.println(insertatany(st, 10, 3));
  }  
}
