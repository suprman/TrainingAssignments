public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = longestDiverseString(1,1,7);
	    System.out.println("Ans : "+ans);

	}
	
	public static String longestDiverseString(int a, int b, int c) {
		int total=a+b+c;
		int countA=0,countB=0,countC=0;
		
		String s="";
		    
		for(int i=0;i<total;i++) {
		    if((a>=b && a>=c && countA!=2)||(a>0 && (countB==2||countC==2))) {
		        s=s+"a";
		        countA++;
		        countB=0;
		        countC=0;
		        a--;
		    }
		    
	    	else if((b>=a && b>=c && countB!=2)||(b>0 && (countA==2||countC==2))) {
		        s=s+"b";
		        countB++;
		        countA=0;
		        countC=0;
		        b--;
		    }
	    	
	    	else if((c>=b && c>=a && countC!=2)||(c>0 && (countB==2||countA==2))) {
		        s=s+"c";
		        countC++;
		        countA=0;
		        countB=0;        
		        c--;        
		    }
		}
		
		return s;        
	}
}
