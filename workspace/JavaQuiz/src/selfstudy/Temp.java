package selfstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp {

	public static void main(String[] args) {

		Solution s = new Solution();
	


	}

}


class Solution {
    public int[] solution(int[] num_list) {
    	Arrays.sort(num_list); // 오름차순 정렬
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int i = 0; i < num_list.length; i++) {
    		list.add(num_list[i]);
    	}
        
    	list.remove(0);
    	list.remove(0);
    	list.remove(0);
    	list.remove(0);
    	list.remove(0);
    	int[] answer = new int[list.size()];
    	for(int i = 0; i < list.size(); i++) {
    		answer[i] = list.get(i);
    	}
    	
        return answer;
    }
}