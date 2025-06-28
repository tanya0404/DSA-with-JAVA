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
    // Stack<Integer> temp= new Stack<>();
    // while(!s.isEmpty()){
    //   temp.push(s.pop());
    // }
    Stack<Integer> temp=reverse(s);
    Stack<Integer> copy= new Stack<>();
    while(!temp.isEmpty()){
      copy.push(temp.pop());
    }
    return copy;
  }

  public static void main(String[] args) {
    
  
  Stack<Integer> st=new Stack<>();
  st.push(1);
  st.push(2);
  st.push(3);
    System.out.println(st);
  // System.out.println(reverse(st));
  System.out.println(copy(st));
  }  
}
