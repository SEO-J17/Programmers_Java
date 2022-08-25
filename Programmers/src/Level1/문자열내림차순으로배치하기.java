package Level1;

import java.util.*;

public class 문자열내림차순으로배치하기 {

	class Solution {
		public String solution(String s) {
			String arr[] = new String[s.length()];
			for (int i = 0; i < s.length(); i++) {
				arr[i] = String.valueOf(s.charAt(i));
			}
			Arrays.sort(arr, Collections.reverseOrder());

			StringBuilder sb = new StringBuilder();
			for (String c : arr) {
				sb.append(c);
			}
			return sb.toString();
		}
	}
}
