package Level2;

import java.io.*;
import java.util.*;

public class 뉴스클러스터링 {
	class Solution {
		public int solution(String str1, String str2) {
			ArrayList<String> list1 = new ArrayList<>();
			ArrayList<String> list2 = new ArrayList<>();
			ArrayList<String> list3 = new ArrayList<>();
			ArrayList<String> list4 = new ArrayList<>();

			calc(str1, list1);
			calc(str2, list2);

			for (String s : list1) {
				if (list2.remove(s)) {
					list4.add(s);
				}
				list3.add(s);
			}
			for (String s : list2) {
				list3.add(s);
			}

			double j = 0;
			if (list3.size() == 0) {
				j = 1;
			} else {
				j = (double) list4.size() / (double) list3.size();
			}

			return (int) (j * 65536);
		}

		public void calc(String str, ArrayList<String> list) {
			for (int i = 0; i < str.length() - 1; i++) {
				char temp1 = str.charAt(i);
				char temp2 = str.charAt(i + 1);

				if (temp1 >= 'a' && temp1 <= 'z' && temp2 >= 'a' && temp2 <= 'z') {
					list.add(String.valueOf(temp1).toUpperCase() + String.valueOf(temp2).toUpperCase());
				} else if (temp1 >= 'a' && temp1 <= 'z' && temp2 >= 'A' && temp2 <= 'Z') {
					list.add(String.valueOf(temp1).toUpperCase() + String.valueOf(temp2));
				} else if (temp1 >= 'A' && temp1 <= 'Z' && temp2 >= 'a' && temp2 <= 'z') {
					list.add(String.valueOf(temp1) + String.valueOf(temp2).toUpperCase());
				} else if (temp1 >= 'A' && temp1 <= 'Z' && temp2 >= 'A' && temp2 <= 'Z') {
					list.add(String.valueOf(temp1) + String.valueOf(temp2));
				}
			}
		}
	}
}
