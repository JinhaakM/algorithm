package algorithm;

public class programmers014 {

	public static void main(String[] args) {
		Solution014 s= new Solution014();
		int answer=s.solution(12);
		System.out.println(answer);
	}

}
class Solution014 {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<n; i++){
            if(n%i==1){
                answer=i; break;
            }
        }
        return answer;
    }
}