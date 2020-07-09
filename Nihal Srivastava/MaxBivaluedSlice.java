import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class MaxBivaluedSlice {
public static int maxCommonArraySlice(List<Integer> arr) {
    if(arr.size() < 2)
    	return arr.size();

    List<Integer> brr = new LinkedList<>();
    brr.add(arr.get(0));
    int start = 0;
    int end = arr.size();
    int count = 0;
    int max_length = 0;

    while(start < end) {
        if(brr.contains(arr.get(start))) {
            count++;
            start++;
        }
        else if(brr.size() == 1) {
                brr.add(arr.get(start));
        }
        else { 
                count = 0;
                start--;
                brr.set(0, arr.get(start));
                brr.set(1, arr.get(start + 1));
        }

        if(count > max_length) {
            max_length = count;
        }
    }
    return max_length;

}

public static void main(String[] args) {

    List<Integer> input = new LinkedList<Integer>(Arrays.asList(3,4,5,6));
    System.out.println(maxCommonArraySlice(input));

}


}
