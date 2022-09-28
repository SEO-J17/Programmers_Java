package Level2;

public class JadenCase¸¸µé±â {
	class Solution {
		public String solution(String s) {
			StringBuilder sb = new StringBuilder();
			String str = s.toLowerCase();
			String before = "";
			for (int i = 0; i < s.length(); i++) {
				String temp = String.valueOf(str.charAt(i));
				if (temp.equals(" ")) {
					sb.append(temp);
					before = temp;
					continue;
				}

				if (i == 0) {
					sb.append(temp.toUpperCase());
					before = temp;
				} else {
					if (before.equals(" ")) {
						sb.append(temp.toUpperCase());
						before = temp;
						continue;
					} else {
						sb.append(temp);
					}
				}
			}

			return sb.toString();
		}
	}
}
