package Level1;

public class 문자열내p와y의개수 {
	class Solution {
		boolean solution(String s) {
			boolean answer = true;
			s = s.toLowerCase();
			if (!s.contains("p") && !s.contains("y")) {
				return answer;
			}
			int p_num = s.length() - s.replace("p", "").length();
			int y_num = s.length() - s.replace("y", "").length();
			if (p_num != y_num) {
				answer = false;
			}
			return answer;
		}
	}
}
