package Level2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ÃÖ´ñ°ª°ú_ÃÖ¼Ú°ª {
	class Solution {
		public String solution(String s) {
			String answer = "";
			String temp[] = s.split(" ");
			List<Integer> list = new LinkedList();

			for (String d : temp) {
				list.add(Integer.parseInt(d));
			}

			Collections.sort(list);

			answer += String.valueOf(list.get(0));
			answer += " ";
			answer += String.valueOf(list.get(list.size() - 1));

			return answer;
		}
	}
}
