
public class Exam2Main {
	
	public static void main(String[] args) {
		int[] myNums = {1,2,3,4,5};
		Exam2 e2;
		
		for(int i=0; i<myNums.length; i++) {
			try {
				e2=new Exam2 (myNums[i]);
				System.out.println(e2.getNum());
			} 
			catch (NumberFormatException nfe) {
				System.out.println("Bad number.");
			}
			catch(IllegalExam2Exception iee) {
				System.out.println(iee.getMessage());
			}
			finally {
				System.out.println("Let's go!");
			}
		}
	}

}
