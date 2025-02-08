package selfstudynew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class new1 {
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		String[] intStrs = {"0123456789","9876543210","9999999999999"};
		
		System.out.println(s.solution(intStrs, 50000, 5, 5));
		
	}

}


class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {
        	if(Integer.parseInt(intStrs[i].substring(s, s+l)) > k) {
        		answer.add(Integer.parseInt(intStrs[i].substring(s, s+l)));
        	}
        }
        return answer;
    }
}