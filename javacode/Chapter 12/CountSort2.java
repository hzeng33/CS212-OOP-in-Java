/**
 * CountSort2.java
 * 
 * @author Alex Maureau
 * Reviewing Java - Chapter 12
 * http://www.cstutoringcenter.com
 */
public class CountSort2{
   public static void main(String args[]){
	int arr[10] = {4,22,5,7,16,4,8,9,6,1};
	int max = 0, i = 0;

	//find the max number:
	max = arr[0];
	for(i = 1; i < 10; i++)
		if(arr[i] > max) max = arr[i];

	//declare and initialize the array:
	int sorted[] = new int[max+1];
	for(i = 0; i <= max; i++)
		sorted[i] = 0;

	for(i = 0; i < 10; i++)
		sorted[ arr[i] ] ++;

      //new addition below here:
	int index = 0;
	for(i = 0; i <= max; i++){
		for(int j = 0; j < sorted[i]; j++) 
			arr[index++] = i;
	}

   } //main
} //class
