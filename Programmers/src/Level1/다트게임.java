package Level1;

public class 다트게임 {
	class Solution {
		public int solution(String dartResult) {
			int answer = 0;
			int arr[] = new int[3];

			int idx = -1;
			int score = 0;
			for (int i = 0; i < dartResult.length(); i++) {
				char temp = dartResult.charAt(i);
				if (temp >= '0' && temp <= '9') {
					if (temp == '1' && dartResult.charAt(i + 1) == '0') {
						score = 10;
						i++;
					} else {
						score = temp - '0';
					}
				}

				if (temp == 'S') {
					idx++;
					arr[idx] = (int) Math.pow(score, 1);
				} else if (temp == 'D') {
					idx++;
					arr[idx] = (int) Math.pow(score, 2);
				} else if (temp == 'T') {
					idx++;
					arr[idx] = (int) Math.pow(score, 3);
				}

				if (temp == '#') {
					arr[idx] *= (-1);
				} else if (temp == '*') {
					if (idx >= 1) {
						arr[idx - 1] *= 2;
						arr[idx] *= 2;
					} else
						arr[idx] *= 2;
				}

			}

			answer = arr[0] + arr[1] + arr[2];

			return answer;
		}
	}
}
