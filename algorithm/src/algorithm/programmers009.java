package algorithm;

public class programmers009 {

	public static void main(String[] args) {
		Solution009 s=new Solution009();
		long answer=s.solution(121);
		System.out.println(answer);
	}

}
class Solution009 {
	public long solution(long n) {
		long answer = -1;

		for(int i=1; i*i<=n; i++){
			if(Math.pow(i,2)==n) {
				answer=(long)Math.pow(i+1,2);
				break;
			}
		}
		return answer;
	}
}
