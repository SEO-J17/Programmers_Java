package Level1;
import java.util.*;
import java.io.*;
public class �����������Ѽ��� {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        HashMap<String,Integer> map = new HashMap<>();
	        String answer="";
	        for(String d : participant){
	            if(map.containsKey(d)){
	                map.put(d, map.get(d)+1);
	            }else
	                map.put(d, 1);
	        }

	        for(String c : completion){
	            map.put(c, map.get(c)-1);            
	        }

	        for(String d : participant){
	            if(map.get(d) != 0){
	                answer = d;
	            }
	        }

	        return answer;
	    }
	}
}

//getOrDefault�� �־����� ������ �ߺ� üũ�� ���� ����. HashMap�� put�� key�� �����ϸ� value�� ���ο� ������ �ٲ��ֱ� ����
//getOrDefault�� ��������� �ߺ�üũ�ϴ� if�� 10������ �ʿ䰡 ����.
// key, value�� ���� ������ ���� �׻� entrySet�� ����ؾ� �Ѵ�. 
//get�� ��� ����ϸ� �� ��ŭ �ؽ����� ��ġ �ϱ⶧���� ������ �ʴ�. ��Ʈ�� ���� �̿��Ұ�.
//computeIfPresent
//�콬���� key,value������ �����Ǿ������� Ű�� �ߺ��� �Ǹ� �ȵȴ�. value�� �ߺ� ����.