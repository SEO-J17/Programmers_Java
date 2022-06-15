package Level2;

import java.awt.Point;
import java.util.*;

public class 게임맵최단거리 {

	class Solution {
		int dx[] = { 0, 0, -1, 1 };
		int dy[] = { 1, -1, 0, 0 };

		public int solution(int[][] maps) {
			int answer = 0;
			int visit[][] = new int[maps.length][maps[0].length];
			calc(maps, visit);
			answer = visit[maps.length - 1][maps[0].length - 1];

			if (answer == 0) {
				return -1;
			}

			return answer;
		}

		public void calc(int[][] maps, int[][] visit) {
			int x = 0;
			int y = 0;
			visit[x][y] = 1;
			Queue<Point> qu = new LinkedList();
			qu.add(new Point(x, y));

			while (!qu.isEmpty()) {
				Point point = qu.poll();
				int cx = point.x;
				int cy = point.y;
				for (int i = 0; i < 4; i++) {
					int xx = cx + dx[i];
					int yy = cy + dy[i];

					if (xx >= 0 && yy >= 0 && xx < maps.length && yy < maps[0].length) {
						if (visit[xx][yy] == 0 && maps[xx][yy] == 1) {
							visit[xx][yy] = visit[cx][cy] + 1;
							qu.add(new Point(xx, yy));
						}
					}
				}
			}
		}
	}
}
