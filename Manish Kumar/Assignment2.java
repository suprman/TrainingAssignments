/*A Zero Indexed Array A consisting of N integers is given. A pair of integers (P,Q) such that 0<=P<=Q

class Solution { 
public int solution(int[] A); 
}
that, given an Array A consisting of N integers, returns the size of the largest bi-valued slice in A.

For example : A[0] = 5, A[1] = 4, A[2] = 4, A[3] = 5, A[4] = 0, A[5] = 12 the function should return 4, because (0,3) is a slice containing only 4 and 5. Note that a bi-valued slice can also contain just one value. Slice(3,5) is not bi-valued since it consists of three different numbers.
*/



public class Assignment2 {
	
	public static void main(String[] args) {
		int A[] = {5,4,4,5,0,12};
		int ans = solution(A);				//Function Call
		System.out.println("Maximum Bi-Value Slice Range is: "+ans);			//Output
	}

	private static int solution(int[] A) {
		
		int temp1=A[0];
		int temp2=A[1];
		int size=0;				//This will store the current maximum B-Value Slice length
		int max=0;  			//This will store the final maximum Bi-Value Slice length
		
		if(A.length<2)			// If array has only one or zero element
			return 0;
		
		for(int i=0; i<A.length;i++) {
			
			if(A[i]==temp1 || A[i]==temp2) { //Comparing the value if it can be part of Bi-valued slice or not
				size++;
				if(size>max)
					max=size;				
			}
			
			else{
				if(temp1!=temp2) {
					size=2;  //Minimum size of Bi-Valued Slice
				}
				else {
					size++;	//For (1,1,1,1,1,5) type of inputs
				}
				temp1=A[i-1];
				temp2=A[i];
			}
			
		}
		
		return max;
	}
}
