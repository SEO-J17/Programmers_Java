//제일 처음에 1차원 배열로 선언하고 정렬해서 풀었음.. 너무 비효율적이었음
//최대,최소값을 찾고 최대,최소값 둘 중하나가 target이랑 같고 chk가 1이하면 제외했음
package Naver;

import java.io.*;
import java.util.*;

//2021네이버 공채 상반기 1번 기출
public class 네이버1번기출_2021 {		//프로그래머스 위클리 챌린지 2주차_상호평가 문제임
	class Solution {
		public String solution(int[][] scores) {
			String answer = "";
			for (int i = 0; i < scores.length; i++) {
				int target = scores[i][i];
				int chk = 0;
				int avg = 0;
				int sum = 0;
				int min = 999;
				int max = -1;
				int divide = scores[i].length;
				for (int j = 0; j < scores[i].length; j++) {
					int score = scores[j][i];
					if (target == score)
						chk++;

					max = Math.max(score, max);
					min = Math.min(score, min);

					sum += score;
				}

				if (target == min || target == max) {
					if (chk <= 1) {
						sum -= target;
						--divide;
					}
				}

				avg = sum / divide;

				if (avg >= 90) {
					answer += "A";
				} else if (avg >= 80 && avg < 90) {
					answer += "B";
				} else if (avg >= 70 && avg < 80) {
					answer += "C";
				} else if (avg >= 50 && avg < 70) {
					answer += "D";
				} else if (avg < 50) {
					answer += "F";
				}
			}

			return answer;
		}
	}
}
