//���� ó���� 1���� �迭�� �����ϰ� �����ؼ� Ǯ����.. �ʹ� ��ȿ�����̾���
//�ִ�,�ּҰ��� ã�� �ִ�,�ּҰ� �� ���ϳ��� target�̶� ���� chk�� 1���ϸ� ��������
package Naver;

import java.io.*;
import java.util.*;

//2021���̹� ��ä ��ݱ� 1�� ����
public class ���̹�1������_2021 {		//���α׷��ӽ� ��Ŭ�� ç���� 2����_��ȣ�� ������
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
