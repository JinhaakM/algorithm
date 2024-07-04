package algorithm;

public class programmers006 {

	public static void main(String[] args) {
		Solution006 s=new Solution006();
		int answer=s.solution(10);
		System.out.println(answer);
	}

}
class Solution006 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<n; i++){
            if(n%i==1) {answer=i; break;}
        }
        return answer;
    }
}