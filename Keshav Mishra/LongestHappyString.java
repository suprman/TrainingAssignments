package Assignment;

public class LongestHappyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestHappyStringTest test = new LongestHappyStringTest();
		String s = test.longestDiverseString(1, 1, 7);
		System.out.println(s);
	}

}
class LongestHappyStringTest{
    public String longestDiverseString(int a, int b, int c) {
        StringBuffer s = new StringBuffer();
        int countA=a,countB=b,countC=c;
        int occurA=0,occurB=0,occurC=0;
        while(true){
        	if(countA==0 && countB==0 &&countC==0) {
        		break;
        	}
            int k = max(countA,countB,countC);
        if(k==countA && occurA<2){
        	s.append("a");
            countA--;
            occurA++;occurB=0;occurC=0;
        }else if(k==countB && occurB<2){
        	s.append("b");
            countB--;
            occurA=0;occurB++;occurC=0;
        }else if(k==countC && occurC<2){
        	s.append("c");
            countC--;
            occurA=0;occurB=0;occurC++;
        }else {
            if(k==countA) {
            	if(countB>0) {
            		s.append("b");
            		countB--;
            		occurA=0;occurB++;occurC=0;
            	}else if(countC > 0) {
            		s.append("c");
            		countC--;
            		occurA=0;occurB=0;occurC++;
            	}else {
            		break;
            	}
            }else if(k==countB) {
            	if(countA>0) {
            		s.append("a");
            		countA--;
            		occurA++;occurB=0;occurC=0;
            	}else if(countC > 0) {
            		s.append("c");
            		countC--;
            		occurA=0;occurB=0;occurC++;
            	}else {
            		break;
            	}
            }else if(k==countC) {
            	if(countA>0) {
            		s.append("a");
            		countA--;
            		occurA++;occurB=0;occurC=0;
            	}else if(countB > 0) {
            		s.append("b");
            		countB--;
            		occurA=0;occurB++;occurC=0;
            	}else {
            		break;
            	}
            }else {
            	break;
            }
        }
        }
        return s.toString();
    }
    private int max(int a,int b,int c){
        if(a>=b && a>=c){
            return a;
        }else if(b>=a && b>= c){
            return b;
        }else{
            return c;
        }
    }
}
