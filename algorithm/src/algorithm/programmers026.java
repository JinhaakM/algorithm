package algorithm;

public class programmers026 {

	public static void main(String[] args) {
		Solution026_1 s=new Solution026_1();
		int answer=s.solution(13, 17);
		System.out.println(answer);
	}

}
class Solution026 {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int k=0;
            for(int j=1; j<=i; j++){
                if(i%j==0) k++;
            }
            if(k%2==0) answer+=i;
            else answer-=i;
        }
        return answer;
    }
}
class Solution026_1 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            else {
                answer += i;
            }
        }
        return answer;
    }
}