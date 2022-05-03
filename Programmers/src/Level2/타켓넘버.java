package Level2;

public class 타켓넘버 {
	class Solution {
		int answer = 0;

		public int solution(int[] numbers, int target) {
			calc(numbers, 0, target, 0);
			return answer;
		}

		public void calc(int[] arr, int sum, int target, int depth) {
			if (depth == arr.length) {
				if (sum == target) {
					++answer;
					return;
				} else {
					return;
				}
			}

			calc(arr, sum + arr[depth], target, depth + 1);
			calc(arr, sum - arr[depth], target, depth + 1);

		}
	}
}
