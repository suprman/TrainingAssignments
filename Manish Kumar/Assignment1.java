/*A string is called happy if it does not have any of the strings 'aaa', 'bbb' or 'ccc' as a substring.

Given three integers a, b and c, return any string s, which satisfies following conditions:

s is happy and longest possible.
s contains at most a occurrences of the letter 'a', at most b occurrences of the letter 'b' and at most c occurrences of the letter 'c'.
s will only contain 'a', 'b' and 'c' letters.
If there is no such string s return the empty string "".

 

Example 1:

Input: a = 1, b = 1, c = 7
Output: "ccaccbcc"
Explanation: "ccbccacc" would also be a correct answer.
Example 2:

Input: a = 2, b = 2, c = 1
Output: "aabbc"
Example 3:

Input: a = 7, b = 1, c = 0
Output: "aabaa"
Explanation: It's the only correct answer in this case.
 

Constraints:

0 <= a, b, c <= 100
a + b + c > 0*/




public class Assignment1 {
	
	public static void main(String[] args) {
		int A=5;
		int B=1;
		int C=1;
		String S = longestDiverseString(A,B,C);						//Function Call
		System.out.println("Longest happy string is: "+S);			//Output
	}
	
    public static String longestDiverseString(int a, int b, int c) {
        
        String res="";
        int tot=a+b+c;
        int count_a=0;
        int count_b=0;
        int count_c=0;
        
        for(int i=0;i<tot;i++){  																
            if((a>=b && a>=c && count_a!=2)||(a>0 && (count_b==2||count_c==2))){				//Condition to add 'a' in the resultant Happy String
                res=res+"a";
                count_a++;
                count_b=0;
                count_c=0;
                a--;
            }
    
    
            else if((b>=a && b>=c && count_b!=2)||(b>0 && (count_a==2||count_c==2))){			//Condition to add 'b' in the resultant Happy String
                res=res+"b";
                count_b++;
                count_a=0;
                count_c=0;
                b--;
            }
    
    
            else if((c>=b && c>=a && count_c!=2)||(c>0 && (count_b==2||count_a==2))){			//Condition to add 'c' in the resultant Happy String
                res=res+"c";
                count_c++;
                count_a=0;
                count_b=0;        
                c--;        
            }
        }
    
    return res;
    }
}