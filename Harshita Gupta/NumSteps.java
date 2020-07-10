
public class NumSteps 
{
	
	    public int numSteps(String s) 
	    {
	        char[] array = s.toCharArray();
	        
	        
	           int count = 0;
	       
	           int r_index = array.length-1;
	           
	           for(;r_index>0;)
	           {
	               if(array[r_index] == '1')
	               {
	                     while(r_index>=0 && array[r_index] == '1')
	                     {
	                         array[r_index] = '0';
	                         r_index--;
	                         
	                     }
	                     if(r_index>=0){
	                         array[r_index] = '1';
	                     }
	                     count++;
	               }
	               
	               else
	               {
	                   r_index--;
	               }
	           }
	        
	           count += array.length - (r_index+1);
	        
	           return count;
	    }
	}

