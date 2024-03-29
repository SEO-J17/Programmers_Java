package Level2;
import java.io.*;
import java.util.*;
public class 스킬트리 {
	    public int solution(String skill, String[] skill_trees) {
	        int cnt = skill_trees.length;    
	        for(int i=0; i<skill_trees.length; i++){
	            int before = skill_trees[i].indexOf(skill.charAt(0));
	            for(int j=1; j<skill.length(); j++){
	                int now =  skill_trees[i].indexOf(skill.charAt(j));
	                if((before > now && now != -1) || (before == -1 && now != -1)){
	                       cnt--;
	                       break;
	                    }else
	                        before = now;
	                }     
	             }
	        return cnt;
	    }
	}
//indexOf함수는 특정 문자열이 몇번째 인덱스에 알려주는 함수이다. 만약 찾는 문자가 없다면 -1을 반환한다.