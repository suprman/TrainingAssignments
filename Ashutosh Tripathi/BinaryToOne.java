package codilityproject1;

public class BinaryToOne {

	public static void main(String[] args) {
		String str = "1101";
		BinaryOne bobj = new BinaryOne();
		int response = bobj.bto(str);
		System.out.println("response will be...."+response);

	}

}
class BinaryOne
{
    public int bto(String s) 
    {
        char array[] = s.toCharArray();
        
        
           int flag = 0;
           int r = 0;
           int r_index = array.length-1;
           
           for(;r_index>0;){
               if(array[r_index] == '1'){
                     while(r_index>=0 && array[r_index] == '1'){
                         array[r_index] = '0';
                         r_index--;
                         
                     }
                     if(r_index>=0){
                         array[r_index] = '1';
                     }
                     flag++;
               }else{
                   r_index--;
               }
           }
        
           flag += array.length - (r_index+1);
        
           return flag;
    }
}
