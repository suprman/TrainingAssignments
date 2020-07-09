import javax.print.DocFlavor.STRING;

public class ReduceBinary {
	
	public static void majn(String[] args) {
		String S = "1101";
		int res = solution(S);
		System.out.println(res); 		//Output
	}


	public static int solution(String s) {
        
		if (s.length() == 1) 
	         return 0; 
		
	     int cnt = 0; 
	     char[] ans=s.toCharArray(); 
	     for (int j= s.length()-1; j>0;) { 
	    	 
	         if (ans[j] == '0') { 
	             cnt++; 
	             j--; 
	         } 
	         
	         else { 					// if s[j] == '1' 
	             cnt++; 
	  
	             while (ans[j] == '1' && j > 0) { 
	                 cnt++; 
	                 j--; 
	             } 
	             if (j == 0) 
	                 cnt++; 
	             ans[j] = '1'; 		// when 0 is found, it is replaced with 1 
	         } 
	     } 
	     return cnt;
	}
}