package algorithm;

public class programmers037 {

	public static void main(String[] args) {
		int answer=new Solution037().solution(new int[] {-2,3,0,2,-5});
		System.out.println(answer);
	}

}
class Solution037 {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0) answer++;
                }
            }
        }
        return answer;
    }
}