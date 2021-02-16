package Level2;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class 멀쩡한사각형 {
	class Solution {
	    public long solution(long w, long h) {   
	        long com = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
	        return (w*h)-(w/com+h/com-1)*com;
	    }
	}
	
}
//intValue() integer 즉 객체에서 int형을 뽑아내기 위함이다.
//parseInt는 String에서 int 형으로 변환하기 위함.
//유클리드 호제법유형임. 최대공약수를 찾아서 이리저리 해볼것..!
//BigInteger는 거의 무한에 가까운 입력을 필요로할때 사용되며 문자열로 인식된다.
//intValue가 필요할듯..?
//gcd. 최대공약수 내부 함수를 사용하려면 BigInteger.valueOf(a).gcd(BigInteger.valueOf(s).intValue();형식으로 구할것.!