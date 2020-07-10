
public class BiValue
{
	public static void main(String args[])
	{
		int array[]= {1,3,4,6,4};
		int sol=BiValueTest.solution(array);
		System.out.println(sol);
	}
}

class BiValueTest
{
    public static int solution(int[] A) 
    {
        int N = A.length;
        if (N == 3)
            return 0;
        int maxEnding = 0;
        int[] maxSliceLeft = new int[N];
        for (int i = 1; i < N-1; i++) {
            maxEnding = Math.max(0, maxEnding + A[i]);
            maxSliceLeft[i] = maxEnding;
        }
        int[] maxSliceRight = new int[N];
        maxEnding = 0;
        for (int i = N-2; i >= 1; i--) {
            maxEnding = Math.max(0, maxEnding + A[i]);
            maxSliceRight[i] = maxEnding;
        }
        int maxDoubleSlice = 0;
        for (int i = 1; i < N-1; i++) {
            maxDoubleSlice = Math.max(maxDoubleSlice, maxSliceLeft[i-1] + maxSliceRight[i+1]);
        }
        return maxDoubleSlice;
    }
}