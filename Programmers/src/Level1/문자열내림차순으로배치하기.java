package Level1;

import java.util.*;

public class ���ڿ������������ι�ġ�ϱ� {

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
