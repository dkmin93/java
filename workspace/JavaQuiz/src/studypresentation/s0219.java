package studypresentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class s0219 {

}

class Solution {
    public int[] solution(int[] arr) {
       
        if(arr.length == 1) {
        	return new int[]{-1};
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
        	list.add(arr[i]);
        }
        
        int min = list.get(0);
        
        for(int i = 1; i < list.size(); i++) {
        	if(min > list.get(i)) {
        		min = list.get(i);
        	}
        }
        
        list.remove(Integer.valueOf(min));
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}