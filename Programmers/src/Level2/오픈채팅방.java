package Level2;

import java.io.*;
import java.util.*;

public class ¿ÀÇÂÃ¤ÆÃ¹æ {
	class Solution {
		public ArrayList<String> solution(String[] record) {
			String[] answer = new String[record.length];
			String[] uid = new String[record.length];
			ArrayList<String> result = new ArrayList<>();
			HashMap<String, String> map = new HashMap();

			for (int i = 0; i < record.length; i++) {
				StringTokenizer st = new StringTokenizer(record[i]);
				String command = st.nextToken();
				if (command.equals("Enter")) {
					String id = st.nextToken();
					String name = st.nextToken();
					map.put(id, name);
					answer[i] = "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
					uid[i] = id;
				} else if (command.equals("Change")) {
					map.put(st.nextToken(), st.nextToken());
				} else if (command.equals("Leave")) {
					answer[i] = "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
					uid[i] = st.nextToken();
				}
			}
			for (int i = 0; i < record.length; i++) {
				String temp = "";
				if (answer[i] != null && uid[i] != null) {
					temp += map.get(uid[i]) + answer[i];
					result.add(temp);
				}
			}

			return result;
		}
	}

}
