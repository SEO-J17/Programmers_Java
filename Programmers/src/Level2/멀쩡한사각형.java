package Level2;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class �����ѻ簢�� {
	class Solution {
	    public long solution(long w, long h) {   
	        long com = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
	        return (w*h)-(w/com+h/com-1)*com;
	    }
	}
	
}
//intValue() integer �� ��ü���� int���� �̾Ƴ��� �����̴�.
//parseInt�� String���� int ������ ��ȯ�ϱ� ����.
//��Ŭ���� ȣ����������. �ִ������� ã�Ƽ� �̸����� �غ���..!
//BigInteger�� ���� ���ѿ� ����� �Է��� �ʿ���Ҷ� ���Ǹ� ���ڿ��� �νĵȴ�.
//intValue�� �ʿ��ҵ�..?
//gcd. �ִ����� ���� �Լ��� ����Ϸ��� BigInteger.valueOf(a).gcd(BigInteger.valueOf(s).intValue();�������� ���Ұ�.!