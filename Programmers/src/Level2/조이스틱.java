package Level2;

public class 조이스틱 {
	class Solution {
		public int solution(String name) {
			int answer = 0;
			int side = name.length();

			for (int i = 0; i < name.length(); i++) {
				char temp = name.charAt(i);
				answer += Math.min(temp - 'A', 'Z' - temp + 1); // 알파벳바꾸는 횟수

				int next = i + 1;
				while (next < name.length() && name.charAt(next) == 'A') { // A일떈 그냥 넘어가기
					next++;
				}

				// 앞쪽부터 시작할때
				side = Math.min(side, (i * 2) + name.length() - next);
				// 뒤쪽부터 시작할때
				side = Math.min(side, (name.length() - next) * 2 + i);

			}

			return answer + side;
		}
	}

}
