package algorithm;

import java.util.Arrays;

public class programmers029 {

	public static void main(String[] args) {
		Solution029 s=new Solution029();
		int[][] answer=s.solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}});
	
		System.out.println(Arrays.deepToString(answer));
	}

}
class Solution029 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}