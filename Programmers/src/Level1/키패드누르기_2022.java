package Level1;

import java.io.*;
import java.util.*;
import java.awt.Point;

public class 키패드누르기_2022 {
	class Solution {
		public String solution(int[] numbers, String hand) {
			String answer = "";
			HashMap<Integer, Point> map = new HashMap<>();

			int right_pos = 12;
			int left_pos = 10;

			int number = 1;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					map.put(number, new Point(i, j));
					++number;
				}
			}

			for (int i = 0; i < numbers.length; i++) {
				int num = numbers[i];
				if (num == 0) {
					num = 11;
				}

				if (num == 1 || num == 4 || num == 7) {
					answer += "L";
					left_pos = num;
				} else if (num == 3 || num == 6 || num == 9) {
					answer += "R";
					right_pos = num;
				} else {
					int l = (Math.abs(map.get(left_pos).x - map.get(num).x))
							+ (Math.abs(map.get(left_pos).y - map.get(num).y));
					int r = (Math.abs(map.get(right_pos).x - map.get(num).x))
							+ (Math.abs(map.get(right_pos).y - map.get(num).y));
					if (r < l) {
						answer += "R";
						right_pos = num;
					} else if (l < r) {
						answer += "L";
						left_pos = num;
					} else if (l == r) {
						if (hand.equals("right")) {
							answer += "R";
							right_pos = num;
						} else {
							answer += "L";
							left_pos = num;
						}
					}

				}
			}

			return answer;
		}
	}
}
