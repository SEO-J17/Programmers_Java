package Level2;

public class 이진변환반복하기 {
	class Solution {
		public int[] solution(String s) {
			int[] answer = new int[2];

			int cnt = 0;
			int zeroCnt = 0;
			while (true) {
				if (s.length() == 1) {
					answer[0] = cnt;
					answer[1] = zeroCnt;
					break;
				}
				cnt++;
				int len = s.length();
				s = s.replace("0", "");
				zeroCnt += len - s.length();

				s = Integer.toBinaryString(s.length());
			}

			return answer;
		}
	}
}

