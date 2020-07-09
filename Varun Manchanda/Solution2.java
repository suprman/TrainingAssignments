/*
Q2) A Zero Indexed Array A consisting of N integers is given. A pair of integers (P,Q) such that 0<=P<=Q
that, given an Array A consisting of N integers, returns the size of the largest bi-valued slice in A.
For example : A[0] = 5, A[1] = 4, A[2] = 4, A[3] = 5, A[4] = 0, A[5] = 12 the function should return 4, 
because (0,3) is a slice containing only 4 and 5. Note that a bi-valued slice can also contain just one value. 
Slice(3,5) is not bi-valued since it consists of three different numbers.
*/
import java.util.*;
public class LargetBiValue {

	public static int solve(int arr[])
	{
		int ans = (int)-1e18;
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		Deque<Integer> dq = new LinkedList<Integer>();
		for(int i : arr)
		{
			if(hashMap.containsKey(i))
			{
				int v = (int)hashMap.get(i);
				hashMap.put(i,v+1);
				dq.add(i);
				ans = Math.max(ans,dq.size());
			}
			else 
			{
				hashMap.put(i,1);
				if(hashMap.size()<=2)
				{
					dq.add(i);
					ans = Math.max(ans,dq.size());
				}
				else
				{
					while(!dq.isEmpty() && hashMap.size()>2)
					{
						int front = dq.pollFirst();
						if(hashMap.containsKey(front))
						{
							hashMap.remove(front);
						}					
					}
					dq.add(i);
				}
				
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) arr[i] = scan.nextInt();
		System.out.println(solve(arr));
		scan.close();
	}

}
