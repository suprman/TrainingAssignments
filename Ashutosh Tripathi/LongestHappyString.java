package codilityproject1;

public class LongestHappyString {

	public static void main(String[] args) {
		HappyString hobj = new HappyString();
		String response = hobj.hString(7,1,0);
		System.out.println("response will be...."+response);

	}

}
class HappyString {
    public String hString(int a, int b, int c) {
        String str="";
        int ca=0,cb=0,cc=0;
        
        
        int N=a+b+c;
        
        for(int i=0;i<N;i++){
            
            if(a>=b && a>=c && a>1 && ca<2){
                str+="aa";
                a-=2;
                ca=2;
                cb=0;
                cc=0;
            }
            else if(b>=c && b>=a && b>1 && cb<2){
                str+="bb";
                b-=2;
                cb=2;
                ca=0;
                cc=0;
            }
            else if(c>=b && c>=a && c>1 && cc<2){
                str+="cc";
                c-=2;
                cc=2;
                cb=0;
                ca=0;
            }    
            
            else if(a>0 && ca<2){
                str+="a";
                a--;
                ca++;
                cb=0;
                cc=0;
                
            }
            
            else if(b>0 && cb<2){
                str+="b";
                b--;
                cb++;
                ca=0;
                cc=0;
            }
            
            else if(c>0 && cc<2){
                str+="c";
                c--;
                cc++;
                ca=0;
                cb=0;
            }
            
        }
        
        
        return str;
        
    }
}
