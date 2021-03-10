/**
 * Queue.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
public interface Queue {
   public Object dequeue();
   public void enqueue(Object x);
   public boolean empty();
   public int size();
}
