package algorithm;

public class programmers061 {

	public static void main(String[] args) {
		Solution061 s=new Solution061();
		int answer=s.solution(2, 1, 20);
		System.out.println(answer);
	}

}
class Solution061 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a){
            answer=answer + b*(n/a);
            n=b*(n/a)+n%a;
        }
        
        return answer;
    }
}