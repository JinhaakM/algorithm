package algorithm;

import java.util.Arrays;

public class programmers020 {

	public static void main(String[] args) {
		Solution020 s=new Solution020();
		int[] answer=s.solution(new int[] {4,3,2,1});
		System.out.println(Arrays.toString(answer));
	}

}
class Solution020 {
    public int[] solution(int[] arr) {
        
        if(arr.length==1) return new int[] {-1};
        int[] answer=new int[arr.length-1];
        
        int max=Integer.MAX_VALUE;
        int i=0;
        
        for(int arrs:arr) {
            if(arrs<max) max=arrs;
        }
        for(int arrs:arr){
            if(arrs!=max) {answer[i]=arrs; i++;}
        }
        return answer;
    }
}