package Level1;

public class 삼진법뒤집기 {
	class Solution {
		public int solution(int n) {
			int answer = 0;
			String triple = "";

			while (n >= 3) {
				triple += String.valueOf(n % 3);
				n /= 3;
			}

			triple += String.valueOf(n);

			int idx = 0;
			for (int i = triple.length() - 1; i >= 0; i--) {
				int target = Integer.valueOf(triple.charAt(i) - 48);
				answer += (target * Math.pow(3, idx));
				idx++;
			}

			return answer;
		}
	}
}
