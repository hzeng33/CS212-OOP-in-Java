/**
 * Node.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
public class Node {
    private Object data;
    private Node next;
   
    public Node(Object d, Node n) {
      data = d; next = n; 
    }

    public Object getData() { return data; }
    public Node getNext() { return next; }
    public void setData(Object d) { data = d; }
    public void setNext(Node n) { next = n; }
}
