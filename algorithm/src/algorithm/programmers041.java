package algorithm;

import java.util.Arrays;

public class programmers041 {

	public static void main(String[] args) {
		Solution041 s=new Solution041();
		int[] answer=
				s.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2,5,3},{4,4,1},{1,7,3}});
		System.out.println(Arrays.toString(answer));
	}
}
class Solution041 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int k=0;//answer[]의 인덱스
        for(int[] command:commands){
            int j=0;//정렬 용으로 쓰기 위한 arr[]의 인덱스
            int[] arr=new int[command[1]-command[0]+1];
            for(int i=command[0];i<=command[1];i++){
                arr[j]=array[i-1]; j++;
            }
            Arrays.sort(arr);
            answer[k++]=arr[command[2]-1];
        }
        return answer;
    }
}