package Level2;

import java.io.*;
import java.util.*;
import java.awt.Point;

public class 거리두기확인하기 {
	class Solution {
		public int[] solution(String[][] places) {
			int[] answer = new int[places.length];

			for (int i = 0; i < places.length; i++) {
				String[] p = places[i];
				boolean flag = true;

				for (int j = 0; j < 5; j++) {
					for (int k = 0; k < 5; k++) {
						if (p[j].charAt(k) == 'P') {
							if (!calc(j, k, p)) {
								flag = false;
							}
						}
					}
				}

				if (flag) {
					answer[i] = 1;
				} else {
					answer[i] = 0;
				}

			}

			return answer;

		}

		public boolean calc(int x1, int y1, String[] arr) {
			int dx[] = { 0, 0, -1, 1 };
			int dy[] = { 1, -1, 0, 0 };

			Queue<Point> qu = new LinkedList<>();
			qu.offer(new Point(x1, y1));

			while (!qu.isEmpty()) {
				Point point = qu.poll();

				for (int i = 0; i < 4; i++) {
					int xx = dx[i] + point.x;
					int yy = dy[i] + point.y;

					if (xx < 0 || yy < 0 || xx >= 5 || yy >= 5 || (xx == x1 && yy == y1)) {
						continue;
					}

					int distance = Math.abs(xx - x1) + Math.abs(yy - y1);

					if (arr[xx].charAt(yy) == 'P' && distance <= 2) {
						return false;
					} else if (arr[xx].charAt(yy) == 'O' && distance < 2) {
						qu.add(new Point(xx, yy));
					}

				}
			}

			return true;

		}
	}
}
