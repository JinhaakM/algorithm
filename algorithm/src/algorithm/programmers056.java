package algorithm;

import java.util.Arrays;

public class programmers056 {

	public static void main(String[] args) {
		Solution056 s=new Solution056();
		int answer=s.solution(new int[][] {{1,2,3,5},{5,6,7,8},{4,3,2,1}});
		System.out.println(answer);
	}

}
class Solution056 {
    int solution(int[][] land) {
        for(int i=1; i<land.length; i++){
            for(int j=0; j<4; j++){
                int max=0;
                for(int k=0; k<4; k++){
                    if(j!=k) max=Math.max(max,land[i-1][k]);
                }
                land[i][j]+=max;
            }
        }
        return Arrays.stream(land[land.length-1]).max().getAsInt();
    }
}