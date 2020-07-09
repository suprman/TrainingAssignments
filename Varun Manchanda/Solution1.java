/*
Q1) A string is called happy if it does not have any of the strings 'aaa', 'bbb' or 'ccc' as a substring.
Given three integers a, b and c, return any string s, which satisfies following conditions:
s is happy and longest possible.
s contains at most a occurrences of the letter 'a', at most b occurrences of the letter 'b' and at most c occurrences of the letter 'c'.
s will only contain 'a', 'b' and 'c' letters.
If there is no such string s return the empty string "".
*/


class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int n = a+b+c;
		String ans = "";
		int ia = 0, ib = 0, ic = 0;
		while(n-->0)
		{
			if((a>0 && a>=b && a>=c && ia!=2) || (a>0 && (ib==2 || ic==2)))
			{
				ans+='a'; a-=1;
				ia+=1; ib = 0; ic = 0;
			}
			else if((b>0 && b>=a && b>=c && ib!=2) || (b>0 && (ia==2 || ic==2)))
			{
				ans+='b'; b-=1;
				ib+=1; ia = 0; ic = 0;
			}
			else if((c>0 && c>=a && b>=b && ic!=2) || (c>0 && (ia==2 || ib==2)))
			{
				ans+='c'; c-=1;
				ic+=1; ia = 0; ib = 0;
			}
		}
		return ans;
    }
}
