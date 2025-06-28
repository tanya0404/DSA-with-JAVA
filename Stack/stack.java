package Stack;
import java.util.*;
public class stack {

  public static Stack<Integer> reverse(Stack<Integer> st){
    Stack<Integer> temp= new Stack<>();
    while(st.size()!=0){
    temp.push(st.pop());
    }
    return temp;
  }

  public static void main(String[] args) {
    
  
  Stack<Integer> st=new Stack<>();
  st.push(1);
  st.push(2);
  st.push(3);
    System.out.println(st);
  System.out.println(reverse(st));
  }  
}
