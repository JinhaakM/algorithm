package algorithm;

import java.util.Arrays;

public class programmers031 {

	public static void main(String[] args) {
		Solution031 s=new Solution031();
		long[] answer=s.solution(1000000, 987653);
		System.out.println(Arrays.toString(answer));
	}

}
class Solution031 {
	public long[] solution(int n, int m) {
		long[] answer = new long[2];
		long small=Math.min(n,m);
		long big=Math.max(n,m);
		long bigger=big;


		for(long i=small; i>=1; i--){
			if(m%i==0 && n%i==0){
				answer[0]=i; break;
			}
		}

		for(long i=big; i<=big*small; i+=bigger){
			if(i%big==0 && i%small==0) {
				answer[1]=i; break;
			}
		}

		return answer;
	}
}