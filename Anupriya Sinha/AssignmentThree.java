class AssignmentThree {

	public static void main(String[] args) {
		String binaryNumber = "1101";
//		String binaryNumber = "10";
		int steps = BinaryNumberToOne.numSteps(binaryNumber);
		System.out.println("Number of steps required to convert " + binaryNumber + " to " + "1 : " +steps);
	}
}

class BinaryNumberToOne{

     public static int numSteps(String s) {
	
     int steps=0;
	
	while(s.length()>1){
	    int l=s.length();
	    if(s.charAt(l-1)=='1'){		// If string represents odd, add 1 to it
	        s = addOne(s);
	    }else{				// If string represents even number, divide it by 2
	        s = s.substring(0,l-1);
	    }
	    steps++;
	}
	return steps;
    }
    
    public static String addOne(String s){	// Function to add 1 to string
        int n=s.length();
        String r="";
        char carry=1;
        
        for(int i=n-1;i>=0;i--){
            if(carry==1 && s.charAt(i)=='1'){
                r = "0" + r;
                carry=1;
            }else if(carry==1 &&  s.charAt(i)=='0'){
                r = s.substring(0,i) + "1" + r;
                carry=0;
                break;
            }
        }
        if(carry==1)r = "1"+r;
        return r;
    }

}
