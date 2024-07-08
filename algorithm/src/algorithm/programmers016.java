package algorithm;

public class programmers016 {

	public static void main(String[] args) {
		Solution016 s=new Solution016();
		int answer=s.solution(626331);
		System.out.println(answer);
	}

}
class Solution016 {
    public int solution(int num2) {
        int answer = 0;
        long num=(long)num2;
        if(num==1) return 0;
        
        while(num!=1){
            if(num%2==0){
                num=num/2;
            }else{
                num=num*3+1;
            }
            answer++;
            if(answer==500){
                answer=-1; break;
            }
        }
        return answer;
    }
}