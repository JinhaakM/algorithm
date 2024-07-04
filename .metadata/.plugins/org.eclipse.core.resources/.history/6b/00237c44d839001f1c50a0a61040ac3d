package algorithm;

public class programmers005 {

	public static void main(String[] args) {
		Solution005 s=new Solution005();
		int answer=s.solution(12);
		System.out.println(answer);
	}
}

class Solution005 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<n; i++){
            if(n%i==0) answer+=i;
        }
        return answer+n;
    }
}
