package Level1;

import java.io.*;
import java.util.*;

public class 신고결과받기_2022 {
	class Solution {
		public int[] solution(String[] id_list, String[] report, int k) {
			int[] answer = new int[id_list.length];

			HashMap<String, List<String>> list = new HashMap<>();
			HashMap<String, Integer> map = new HashMap<>();

			for (int j = 0; j < id_list.length; j++) {
				map.put(id_list[j], 0);
				list.put(id_list[j], new ArrayList());
			}

			for (int j = 0; j < report.length; j++) {
				StringTokenizer st = new StringTokenizer(report[j]);
				String str1 = st.nextToken();
				String str2 = st.nextToken();
				if (!list.get(str1).contains(str2)) {
					list.get(str1).add(str2);
					int temp = map.get(str2);
					map.put(str2, ++temp);
				}

			}

			for (int i = 0; i < id_list.length; i++) {
				int cnt = 0;
				String temp = id_list[i];
				for (int j = 0; j < list.get(temp).size(); j++) {
					if (map.get(list.get(temp).get(j)) >= k) {
						++cnt;
					}
				}
				answer[i] = cnt;
			}

			return answer;
		}
	}
}
