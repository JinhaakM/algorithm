package algorithm;

public class programmers027 {

	public static void main(String[] args) {
		Solution027 s=new Solution027();
		long answer=s.solution(3, 20, 4);
		System.out.println(answer);
	}

}
class Solution027 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i=1; i<=count; i++){
            answer=answer+(price*i);
        }
        if(answer>money) return answer-money;
        else return 0;
    }
}