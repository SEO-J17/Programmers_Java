package Level1;

import java.io.*;
import java.util.*;

public class ���ϸ� {
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
// ���� �� �ʿ䰡 �����Ƿ� Ʈ���� ���� ���� �ؽü��� ���� ���� �� ���Ҵ�.