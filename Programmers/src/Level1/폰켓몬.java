package Level1;

import java.io.*;
import java.util.*;

public class 폰켓몬 {
	class Solution {
		public int solution(int[] nums) {
			int answer = 0;
			TreeSet<Integer> set = new TreeSet<>();
			int max = nums.length / 2;

			for (int i = 0; i < nums.length; i++) {
				set.add(nums[i]);
			}
			if (set.size() >= max) {
				answer = max;
			} else {
				answer = set.size();
			}

			return answer;
		}
	}
}
// 정렬 할 필요가 없으므로 트리셋 보다 빠른 해시셋을 쓰는 것이 더 나았다.