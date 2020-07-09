class AssignmentOne {

    public static void main(String[] args) {
    	int a=1,b=1,c=7;
	String logestHappyString = LogestHappyString.longestDiverseString(a,b,c);
	System.out.printf("Longest happy string with a=%d, b=%d, c=%d is : %s\n", a, b, c, logestHappyString);
    }
}

class LogestHappyString{

     	public static String longestDiverseString(int a, int b, int c) {
        int n = a+b+c;
        int countA=0, countB=0, countC=0;
        String s="";
        	
          for(int i=0;i<n;i++)    
          {    
            if(a>=b && a>=c){
                
                if(countA<2){
                    s = s+"a";
                    a--;
                    countA++; countB=0; countC=0;
                }else if(b!=0 && b>=c && countB<2){
                    s = s+"b";
                    b--;
                    countA=0; countB++;; countC=0;
                }else if(c!=0 && c>=b && countC<2){
                    s = s+"c";
                    c--;
                    countA=0; countB=0; countC++;
                }
                
            }else if(b>=a && b>=c){
                
                if(countB<2){
                    s = s+"b";
                    b--;
                    countA=0; countB++; countC=0;
                }else if(a!=0 && a>=c && countA<2){
                    s = s+"a";
                    a--;
                    countA++; countB=0;; countC=0;
                }else if(c!=0 && c>=a && countC<2){
                    s = s+"c";
                    c--;
                    countA=0; countB=0; countC++;
                }
                
            }else{
                
                if(countC<2){
                    s = s+"c";
                    c--;
                    countA=0; countB=0; countC++;
                }else if(a!=0 && a>=b && countA<2){
                    s = s+"a";
                    a--;
                    countA++; countB=0;; countC=0;
                }else if(b!=0 && b>=a && countB<2){
                    s = s+"b";
                    b--;
                    countA=0; countB++; countC=0;
                }
                
            }
        }
        return s;
     }

}
