package algorithm;

public class programmers018 {

	public static void main(String[] args) {
		Solution018 s=new Solution018();
		int[] numbers= {1,2,3,4,6,7,8,0};
		int answer=s.solution(numbers);
		System.out.println(answer);
	}

}
class Solution018 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int num:numbers){
            answer-=num;
        }
        return answer;
    }
}