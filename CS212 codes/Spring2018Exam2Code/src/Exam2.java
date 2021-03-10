
public class Exam2 {
	private int num;
	
	public Exam2(int n) {
		if(n%2 == 0) throw new IllegalExam2Exception("Even number.");
		
		num=n;
	}
	
	public int getNum() {
		return num;
	}

}
