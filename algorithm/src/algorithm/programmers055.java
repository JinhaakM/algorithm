package algorithm;

public class programmers055 {

	public static void main(String[] args) {
		Solution055 s=new Solution055();
		int answer=s.solution(3);
		System.out.println(answer);
	}

}
class Solution055 {
    public int solution(int n) {
        int[] fibo=new int[n+1];
        fibo[0]=0; 
        fibo[1]=1;
        for(int i=2;i<=n; i++){
            fibo[i]=(fibo[i-1]%1234567+fibo[i-2]%1234567)%1234567;
        }
        return fibo[n];
    }
}