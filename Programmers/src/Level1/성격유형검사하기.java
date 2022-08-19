package Level1;

import java.util.*;

public class 성격유형검사하기 {
	class Solution {
		public String solution(String[] survey, int[] choices) {
			String answer = "";
			HashMap<String, Integer> map = new HashMap();
			map.put("R", 0);
			map.put("T", 0);
			map.put("C", 0);
			map.put("F", 0);
			map.put("J", 0);
			map.put("M", 0);
			map.put("A", 0);
			map.put("N", 0);
			for (int i = 0; i < survey.length; i++) {
				String str1 = String.valueOf(survey[i].charAt(0));
				String str2 = String.valueOf(survey[i].charAt(1));
				int score = choices[i];
				if (score == 4) {
					continue;
				} else if (score >= 5) {
					map.put(str2, map.get(str2) + (score - 4));
				} else {
					if (score == 1) {
						map.put(str1, map.get(str1) + 3);
					} else if (score == 3) {
						map.put(str1, map.get(str1) + 1);
					} else {
						map.put(str1, map.get(str1) + 2);
					}
				}
			}

			if (map.get("R") >= map.get("T")) {
				answer += "R";
			} else {
				answer += "T";
			}
			if (map.get("C") >= map.get("F")) {
				answer += "C";
			} else {
				answer += "F";
			}
			if (map.get("J") >= map.get("M")) {
				answer += "J";
			} else {
				answer += "M";
			}
			if (map.get("A") >= map.get("N")) {
				answer += "A";
			} else {
				answer += "N";
			}
			return answer;
		}
	}
}
