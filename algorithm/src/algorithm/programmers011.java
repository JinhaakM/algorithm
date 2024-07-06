package algorithm;

public class programmers011 {

	public static void main(String[] args) {
		Solution011 s=new Solution011();
		int[] arr= {1,2,3,4};
		double answer=s.solution(arr);
		System.out.println(answer);
	}

}
class Solution011 {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i:arr){
            answer+=i;
        }
        return answer/arr.length;
    }
}