package Level2;

import java.io.*;
import java.util.*;

public class 메뉴리뉴얼 {
	class Solution {
		HashMap<String, Integer> map;
		int max;

		public String[] solution(String[] orders, int[] course) {
			PriorityQueue<String> qu = new PriorityQueue<>();

			for (int i = 0; i < course.length; i++) {
				map = new HashMap<>();
				max = 0;

				for (int j = 0; j < orders.length; j++) {
					calc(0, "", course[i], 0, orders[j]);
				}

				for (String d : map.keySet()) {
					if (map.get(d) == max && max > 1) {
						qu.add(d);
					}
				}
			}

			String answer[] = new String[qu.size()];
			int idx = 0;

			while (!qu.isEmpty()) {
				answer[idx++] = qu.poll();
			}

			return answer;
		}

		public void calc(int depth, String str, int target, int idx, String menu) {
			if (depth == target) {
				char[] arr = str.toCharArray();
				Arrays.sort(arr);
				String temp = "";

				for (int i = 0; i < arr.length; i++) {
					temp += arr[i];
				}

				map.put(temp, map.getOrDefault(temp, 0) + 1);
				max = Math.max(max, map.get(temp));
				return;

			}

			for (int i = idx; i < menu.length(); i++) {
				char temp = menu.charAt(i);
				calc(depth + 1, str + temp, target, i + 1, menu);
			}
		}
	}
}
