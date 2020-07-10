class Assignment1 {

	public static void main(String[] args) {
		
		System.out.println(diverseString(1,3,1));

	}
	
	
	public static String diverseString(int a, int b, int c)
	{
	
		int total=a+b+c;
		int occA=0,occB=0,occC=0;
		    
		    
		    String s="";
		    
		for(int i=0;i<total;i++)    
		{
		    
		    if((a>=b && a>=c && occA!=2)||(a>0 && (occB==2||occC==2)))
		    {
		        s=s+"a";
		        occA++;
		        occB=0;
		        occC=0;
		        a--;
		    }
		    
		    
		           else if((b>=a && b>=c && occB!=2)||(b>0 && (occA==2||occC==2)))
		    {
		        s=s+"b";
		        occB++;
		        occA=0;
		        occC=0;
		        b--;
		    }
		    
		    
		            else if((c>=b && c>=a && occC!=2)||(c>0 && (occB==2||occA==2)))
		    {
		        s=s+"c";
		        occC++;
		        occA=0;
		        occB=0;        
		        c--;        
		    }
		}
		    
		    return s;	
		
		
	}	
}

