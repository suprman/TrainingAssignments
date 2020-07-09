/*
Q3) Given a number s in their binary representation. Return the number of steps to reduce it to 1 under the following rules:
If the current number is even, you have to divide it by 2.
If the current number is odd, you have to add 1 to it.
It's guaranteed that you can always reach to one for all testcases.
*/
class Solution {
    public int numSteps(String s) {
        List<Integer> arr = new ArrayList<Integer>();
        int c = 0;
        for(char x : s.toCharArray())
        {
            if(x=='1') arr.add(1);
            else arr.add(0);
        }
        while(arr.size()!=1)
        {
            if(arr.get(arr.size()-1)==1)
            {
                c++;
                for(int i=arr.size()-1; i>=0; i--)
                {
                    if(arr.get(i)==0)
                    {
                        arr.set(i,1);
                        break;
                    }
                    else arr.set(i,0);
                }
                if(arr.get(0)==0) arr.add(0,1);
            }
            else
            {
                c++;
                arr.remove(arr.size()-1);
            }
        }
        return c;
    }
}
