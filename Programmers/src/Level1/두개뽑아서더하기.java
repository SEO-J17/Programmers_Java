package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class �ΰ��̾Ƽ����ϱ� {
	  public ArrayList<Integer> solution(int[] numbers) {
	        HashSet<Integer> set = new HashSet<>();             
	        for(int i=0; i<numbers.length-1; i++){
	            for(int j=i+1; j<numbers.length; j++){
	                set.add(numbers[i]+numbers[j]);                    
	            }
	        }
	        ArrayList<Integer> list = new ArrayList<>(set);
	        Collections.sort(list);    
	        
	        return list;
	    }
}
//�����迭�� �־����� �ΰ��� �̾Ƽ� �ߺ����� ���� ����ϴ°�.
//hashset�� �̿��ϰ� ArrayList�� �ٲٴ� �����߿� ���� Ÿ���� int[] ���� �ٸ� �迭�� ������ �ű���� 
//���ʿ��� ��Ȳ �̾��µ� ���� Ÿ���� ArrayList<Integer>�� �ٲٸ� �ذ�Ǵ� ���� ����.
//HashSet�� �ƴ� TreeSet�� �̿��ϸ� ���İ� ������ ���ÿ� �̷������ �˾ƵѰ�.
 