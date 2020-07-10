package codilityproject1;
import java.util.*;
public class LargestBiValued {

	public static void main(String[] args) {
		int arr[] = {5,4,4,5,0,12};
		Largest lobj = new Largest();
		int response = lobj.bToOne(arr);
		System.out.println("response will be...."+response);


	}

}
class Largest{
	public int bToOne(int[] A) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		int first =0,i=0;
		int[] B = new int[2];
		B[0]=-1;B[1]=-1;
		for(;i<A.length;i++) {
			if(B[0]==-1) {
				B[0] = A[i];
			}else if(B[1]==-1) {
				B[1] = A[i];
			}else {
				if(B[0]!=A[i] && B[1]!=A[i]) {
					l.add(i-first);
					first = i-1;
					int k = A[i-1];
					if(B[0]!=k) B[0]=A[i];
					else B[1]=A[i];
				}
			}
		}
		l.add(i-first);
		return Collections.max(l);
	}
}
