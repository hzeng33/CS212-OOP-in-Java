/**
 * SimpleStack.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
public class SimpleStack implements Stack{
    private Object data[];
    private int top, max_size;

    public SimpleStack() {
           	data = new Object[1000];
          	top = -1;
	     	max_size = 1000;
    }
    public SimpleStack(int size) {
		if(size <= 0)
		  throw new RuntimeException("Size must be at least 1");
           	data = new Object[size];
          	top = -1;
	     	max_size = size;
    }
    
    public int size() { return top + 1; }
    public boolean empty() { return top == -1; }
    
    public void push(Object x) {
        if (size() == max_size) 
           throw new RuntimeException("Stack Full");
        data[++top] = x;
    }
    public Object pop() {
        if (empty()) throw new RuntimeException("Stack Empty");
        return data[top--]; 
    }                      

   //method for testing purposes
   public String toString() {
      String ans = "Stack:  ";
      for (int i = top; i>= 0; i--)
         ans += data[i]; 
   if(i != 0) ans += " -> ";
      return ans;
   }
} //class
