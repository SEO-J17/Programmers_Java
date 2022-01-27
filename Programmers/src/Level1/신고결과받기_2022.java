package Level1;

import java.io.*;
import java.util.*;

public class 신고결과받기_2022 {
	class Solution {
		public int[] solution(String[] id_list, String[] report, int k) {
			int[] answer = new int[id_list.length];
			ArrayList<String> list[] = new ArrayList[id_list.length];
			HashMap<String, Integer> map = new HashMap<>();

			for (int j = 0; j < id_list.length; j++) {
				map.put(id_list[j], 0);
			}

			for (int i = 0; i < id_list.length; i++) {
				list[i] = new ArrayList();
				for (int j = 0; j < report.length; j++) {
					StringTokenizer st = new StringTokenizer(report[j]);
					String str1 = st.nextToken();
					String str2 = st.nextToken();
					if (id_list[i].equals(str1)) {
						if (!list[i].contains(str2)) {
							list[i].add(str2);
							int temp = map.get(str2);
							map.put(str2, ++temp);
						}
					}
				}
			}

			for (int i = 0; i < id_list.length; i++) {
				int cnt = 0;
				for (int j = 0; j < list[i].size(); j++) {
					if (map.get(list[i].get(j)) >= k) {
						++cnt;
					}
				}
				answer[i] = cnt;
			}

			return answer;
		}
	}
}
