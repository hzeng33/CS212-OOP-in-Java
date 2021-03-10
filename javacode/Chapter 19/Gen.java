/**
 * Gen.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 19
 * http://www.cstutoringcenter.com
 */
public class Gen<T>{
	T data;
	
	Gen(T data){
		this.data = data;
	}	
	public T getData() { return data; }
	public void setData(T data) {
		this.data = data;
	}
} //Gen
