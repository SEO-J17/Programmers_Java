package Level1;

public class ���￡���輭��ã�� {
	class Solution {
		public String solution(String[] seoul) {
			String answer = "";
			int idx = 0;
			for (int i = 0; i < seoul.length; i++) {
				if (seoul[i].equals("Kim")) {
					idx = i;
					break;
				}
			}
			answer = "�輭���� " + idx + "�� �ִ�";
			return answer;
		}
	}
}
