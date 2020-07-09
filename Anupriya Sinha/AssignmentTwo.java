import java.util.HashMap;

public class AssignmentTwo {

	public static void main(String[] args) {
//		int array[] = {5,4,5,8,6,6,0,0,6,7,6,7,7,7,7,7,12};
//		int array[] = {5,5,5,5,5};
		int array[] = {0,5,5,5,6,6,6,7,4,0};
		int largestBiSlice = LongestBiValueSlice.solution(array);
		System.out.println("Length of largest bi value slice is : "+largestBiSlice);
	}
}


class LongestBiValueSlice{

	public static int solution(int a[]) {
		int largestBiSlice=0, start=0,end=0,n=a.length;
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			if(h.containsKey(a[i])) {		// If a[i] is already present, increment its count
				int v=h.get(a[i]);
				h.put(a[i], v+1);
			}else if(h.size()<=1) {			//If hashmap contain only one element, add a[i] to hashmap and increment its count
				h.put(a[i], 1);
			}else {					//If a[i] is not present and hashmap already contains two values
				int t=start;
				while(t<end && true) {		// remove elements from slice and hence hashmap until hashmap.size()=2
					int x = h.get(a[t]);
					if(x==1) {
						h.remove(a[t]);
						start = t+1;
						break;
					}else {
						h.put(a[t], x-1);
						start = t+1;
						t++;
					}
				}
				h.put(a[i], 1);
			}
			end=i;
			largestBiSlice = Math.max(largestBiSlice, end-start+1);
		}
		return largestBiSlice;
	}

}
