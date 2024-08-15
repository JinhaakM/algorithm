package algorithm;

public class programmers064 {

	public static void main(String[] args) {
		Solution064 s=new Solution064();
		int answer=s.solution(10, 3, 2);
		System.out.println(answer);
	}

}
class Solution064 {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        
        for(int i=2; i<=number; i++){
            int li=0;
            for(int j=1; j*j<=i; j++){
                if(i%j==0 && j*j==i) li++;
                else if(i%j==0)      li+=2;
            }
            if(li<=limit) answer+=li;
            else answer+=power;    
        }
        return answer;
    }
}