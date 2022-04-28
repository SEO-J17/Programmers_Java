package Level1;

import java.io.*;
import java.util.*;

public class k¹øÂ°¼ö {

	class Solution {
		public int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];

			for (int i = 0; i < commands.length; i++) {
				int n1 = commands[i][0];
				int n2 = commands[i][1];
				int k = commands[i][2];
				ArrayList<Integer> list = new ArrayList<>();
				for (int j = n1 - 1; j < n2; j++) {
					list.add(array[j]);
				}
				Collections.sort(list);
				answer[i] = list.get(k - 1);

			}

			return answer;
		}
	}
}
