package Level2;

import java.io.*;
import java.util.*;

public class 문자열압축 {
	public int solution(String s) {
		int answer = 9999;
		for (int i = 1; i <= s.length() / 2; i++) {
			String temp = s.substring(0, i);
			int cnt = 0;
			String str = "";
			for (int j = 0; j < s.length(); j += i) {
				if ((i + j) > s.length()) {
					if (cnt == 1) {
						str += temp;
					} else {
						str += cnt + temp;
					}

					str += s.substring(j, s.length());
					break;
				}

				if (temp.equals(s.substring(j, i + j))) {
					++cnt;
				} else if (!temp.equals(s.substring(j, i + j))) {
					if (cnt == 1 || cnt == 0) {
						str += temp;
					} else {
						str += cnt + temp;
					}

					temp = s.substring(j, i + j);
					cnt = 1;

				}

				if (i + j == s.length()) {
					if (cnt == 1) {
						str += temp;
					} else {
						str += cnt + temp;
					}
				}
			}

			answer = Math.min(answer, str.length());

		}

		if (s.length() == 1) {
			answer = 1;
		}

		return answer;
	}
}
