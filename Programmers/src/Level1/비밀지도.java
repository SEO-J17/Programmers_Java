package Level1;

public class 비밀지도 {
	class Solution {
		public String[] solution(int n, int[] arr1, int[] arr2) {
			String[] answer = new String[n];

			for (int i = 0; i < n; i++) {
				String st1 = Integer.toBinaryString(arr1[i]);
				String st2 = Integer.toBinaryString(arr2[i]);
				String temp = "";
				
				if (st1.length() < n) {
					st1 = calc(st1, n - st1.length());
				}
				if (st2.length() < n) {
					st2 = calc(st2, n - st2.length());
				}

				for (int j = 0; j < n; j++) {
					if (st1.charAt(j) - '0' == 1 || st2.charAt(j) - '0' == 1) {
						temp += "#";
					} else {
						temp += " ";
					}
				}
				answer[i] = temp;
			}

			return answer;
		}

		public String calc(String str, int num) {
			String temp = "";
			for (int i = 0; i < num; i++) {
				temp += "0";
			}
			str = temp + str;
			return str;
		}
	}
}
