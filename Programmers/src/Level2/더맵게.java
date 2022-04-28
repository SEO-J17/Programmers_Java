package Level2;

import java.io.*;
import java.util.*;

public class ´õ¸Ê°Ô {
	class Solution {
		public int solution(int[] scoville, int K) {
			PriorityQueue<Integer> qu = new PriorityQueue<>();
			int answer = 0;

			for (int i = 0; i < scoville.length; i++) {
				qu.add(scoville[i]);
			}
				
			while (qu.peek() <= K) {
				if (qu.size() <= 1) {
					answer = -1;
					break;
				}
				++answer;

				int min1 = qu.poll();
				int min2 = qu.poll();
				int mix = min1 + (min2 * 2);
				qu.add(mix);

			}

			return answer;
		}
	}
}
