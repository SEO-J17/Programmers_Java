package Level2;

import java.util.*;

public class 영어끝말잇기 {
	class Solution {
		public int[] solution(int n, String[] words) {
			int[] answer = new int[2];
			ArrayList<String> list = new ArrayList();
			int people = 1;
			int cnt = 1;
			String before = "";

			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				if (people > n) {
					people = 1;
					cnt++;
				}
				if (list.contains(word) || !word.startsWith(before)) {
					answer[0] = people;
					answer[1] = cnt;
					break;
				}
				list.add(word);
				before = String.valueOf(word.charAt(word.length() - 1));
				people++;
			}

			return answer;
		}
	}
}
