package Level1;

import java.io.*;
import java.util.*;

public class ½ÇÆÐÀ² {
	class Solution {
		public ArrayList<Integer> solution(int N, int[] stages) {
			ArrayList<Integer> answer = new ArrayList<>();
			PriorityQueue<Integer> qu = new PriorityQueue<>();
			PriorityQueue<Double> fail_qu = new PriorityQueue<>(Collections.reverseOrder());
			double[] fail_arr = new double[N + 1];

			for (int i = 0; i < stages.length; i++) {
				qu.add(stages[i]);
			}

			for (int i = 1; i <= N; i++) {
				int cnt = 0;
				int whole = qu.size();
				while (!qu.isEmpty()) {
					if (qu.peek() == i) {
						qu.poll();
						cnt++;
					} else {
						break;
					}
				}

				double fail = 0;
				if (whole == 0) {
					fail = 0;
				} else {
					fail = (double) cnt / whole;
				}

				fail_arr[i] = fail;
				fail_qu.add(fail);
			}

			while (!fail_qu.isEmpty()) {
				double target = fail_qu.poll();
				for (int i = 1; i <= N; i++) {
					if (fail_arr[i] == target) {
						fail_arr[i] = -1;
						answer.add(i);
					}
				}

			}

			return answer;
		}
	}
}
