package Level2;

import java.io.*;
import java.util.*;

public class 카카오프렌즈컬러링북 {
	class Solution {
		int dx[] = { 0, 0, 1, -1 };
		int dy[] = { 1, -1, 0, 0 };
		boolean[][] visit;
		int cnt = 0;

		public int[] solution(int m, int n, int[][] picture) {
			int[] answer = new int[2];
			int max = Integer.MIN_VALUE;
			visit = new boolean[m + 1][n + 1];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					int land = 0;
					cnt = 0;
					if (!visit[i][j] && picture[i][j] != 0) {
						++land;
						calc(i, j, picture, m, n);
						answer[0] += land;
						if (cnt > max) {
							max = cnt;
							answer[1] = max;
						}
					}
				}
			}

			return answer;
		}

		private void calc(int x, int y, int[][] arr, int m, int n) {
			visit[x][y] = true;
			++cnt;
			for (int i = 0; i < 4; i++) {
				int xx = x + dx[i];
				int yy = y + dy[i];
				if (xx >= 0 && xx < m && yy >= 0 && yy < n) {
					if (!visit[xx][yy] && arr[x][y] == arr[xx][yy]) {
						calc(xx, yy, arr, m, n);
					}
				}
			}
		}

	}
}
