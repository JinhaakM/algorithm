package algorithm;

public class programmers012 {

	public static void main(String[] args) {
		Solution012 s= new Solution012();
		boolean answer=s.solution(18);
		System.out.println(answer+" 하샤드 수 입니다.");
	}

}
class Solution012 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        int y=x;
        while(y>=10){
            int remain=y%10;
            sum+=remain;
            y=y/10;
        }
        sum+=y;
        if(x%sum==0) answer=true;
        else answer=false;
        
        return answer;
    }
}