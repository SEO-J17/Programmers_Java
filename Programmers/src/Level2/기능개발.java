package Level2;
import java.util.*;
import java.io.*;
import java.math.*;
public class ��ɰ��� {
	class Solution {
	    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
	        ArrayList <Integer> list = new ArrayList<>();
	        Queue<Integer> qu = new LinkedList<>();
	        for(int i=0; i < speeds.length; i++){
	           int day = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
	            qu.offer(day);
	        }
	        int cnt=1;
	        int temp = qu.poll();
	        while(!qu.isEmpty()){     
	                if(temp >= qu.peek()){
	                     cnt+=1;
	                     qu.poll();
	                }else{
	                    list.add(cnt);
	                    cnt = 1;      
	                    temp = qu.poll();
	                }            
	            
	            if(qu.isEmpty()){
	                list.add(cnt);
	                break;
	            }            
	         
	        } 
	           return list;  
	        }                              
	    }
}
//�������� �������� �ø��� ���� �ʾ� ĳ������ �آZ�����.
//Math.round�� 0.4�� ���� �ݿø��ϴ� ����� ������ ������ �÷��� �ϹǷ� Math.ceil�� �̿��ϴ°� �����̴�.
//Math.ceil()�� double������ ������ �ø������� �����. -1.3�̸� -1.0, 2.3 �̸� 3.0 ���� �ø����� ���ִ� �Լ��̴�.




