package algorithm;

import java.util.Arrays;

public class programmers004 {

	public static void main(String[] args) {
		Solution004 s=new Solution004();
		int[] answer=s.solution(12345);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution004 {
    public int[] solution(long n) {
        String s=String.valueOf(n);
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            answer[i]=(int)(n%10);
            n=n/10;
        }
        
        return answer;
    }
}
