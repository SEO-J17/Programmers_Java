package Level1;
import java.util.*;
import java.io.*;
public class 완주하지못한선수 {
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

//getOrDefault를 넣어주지 않으면 중복 체크가 되지 않음. HashMap의 put은 key가 존재하면 value를 새로운 값으로 바꿔주기 때문
//getOrDefault을 사용했으면 중복체크하는 if문 10번줄이 필요가 없다.
// key, value를 같이 가져올 때는 항상 entrySet을 사용해야 한다. 
//get을 계속 사용하면 그 만큼 해쉬맵을 서치 하기때문에 좋지는 않다. 엔트리 셋을 이용할것.
//computeIfPresent
//헤쉬맵은 key,value값으로 구성되어있으며 키는 중복이 되면 안된다. value는 중복 가능.