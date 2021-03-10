/**
 * SimpleQueue.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 20
 * http://www.cstutoringcenter.com
 */
public class SimpleQueue implements Queue{
   	private Object data[];
   	private int front, rear, size, capacity;

	public SimpleQueue() {
      		capacity = 1000;
       		data = new Object[capacity];
       		front = rear = size = 0;
	}

	public SimpleQueue(int c) {
		if(c <= 0)
		 throw new RuntimeException("Capacity must be at least 1");
      		capacity = c;
       		data = new Object[capacity];
       		front = rear = size = 0;
	}

   	public int size() { return size; }    
   	public boolean empty() { return size == 0; }
    
   	public void enqueue(Object x) {
       	if (size() == capacity) 
       		throw new RuntimeException("Queue Full");
       	data[rear++] = x;
       	if(rear == capacity) rear = 0;
       	size ++;
   	}
   	public Object dequeue() {
       	if (empty()) 
            throw new RuntimeException("Queue Empty");
       	Object answer = data[front++]; 
       	if (front == capacity) front = 0;
       	size --;
       	return answer;
   	}                      
   	public String toString() {
      	int i, j;
      	String ans = "Queue:  ";
      	for (i = 0, j = front; i< size; i++, j++) {
         		if (j == capacity) j = 0;
         		ans += data[j]; 
            if(i != size-1) 
                   ans += " -> ";
      	}
      	return ans;
   	}
} //class
