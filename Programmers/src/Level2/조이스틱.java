package Level2;

public class ���̽�ƽ {
	class Solution {
		public int solution(String name) {
			int answer = 0;
			int side = name.length();

			for (int i = 0; i < name.length(); i++) {
				char temp = name.charAt(i);
				answer += Math.min(temp - 'A', 'Z' - temp + 1); // ���ĺ��ٲٴ� Ƚ��

				int next = i + 1;
				while (next < name.length() && name.charAt(next) == 'A') { // A�ϋ� �׳� �Ѿ��
					next++;
				}

				// ���ʺ��� �����Ҷ�
				side = Math.min(side, (i * 2) + name.length() - next);
				// ���ʺ��� �����Ҷ�
				side = Math.min(side, (name.length() - next) * 2 + i);

			}

			return answer + side;
		}
	}

}
