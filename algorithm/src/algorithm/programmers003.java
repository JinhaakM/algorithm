package algorithm;

public class programmers003 {

	public static void main(String[] args) {
		Solution003 s=new Solution003();
		int answer=s.solution(194);
		System.out.println(answer);
	}

}
class Solution003 {
    public int solution(int n) {
        int answer = 0;
        int rest=0;
        while(n>=10){//n>10은 10에 대한 경우를 제외하게되므로 틀림.
            rest=rest+n%10;//10으로 나눴을 때 나머지값. 을 구해서 계속 더한다.
            n=n/10;
        }
        answer=rest+n;
        return answer;
    }
}