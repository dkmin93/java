package selfstudy;

import java.util.Arrays;

import selfstudynew.Solution;

public class Notepad {

	public static void main(String[] args) {

		Solution s = new Solution();



	}

}


class Solution { // arr = [0, 1, 2, 3, 4]
	public int[] solution(int[] arr, int[][] queries) { //[[0, 3],[1, 2],[1, 4]]
		int[] answer = {};
		int[] temp = new int[arr.length];

		for(int i = 0; i < queries.length; i++) {

			temp[queries[i][1]] = queries[i][0];
			temp[queries[i][0]] = queries[i][1];

		}
		
		answer = temp;
		return answer;
	}
}