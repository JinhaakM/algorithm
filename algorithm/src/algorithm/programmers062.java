package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class programmers062 {

	public static void main(String[] args) {
		Solution062 s=new Solution062();
		int[] answer=s.solution(3, new int[] {10, 100, 20, 150, 1, 100, 200});
		System.out.println(Arrays.toString(answer));
	}

}
class Solution062 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> honor=new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
                honor.add(score[i]);
                Collections.sort(honor,Collections.reverseOrder());
                if(honor.size()<=k){
                    answer[i]=honor.get(honor.size()-1);
                }else{
                    answer[i]=honor.get(k-1);   
                }          
        }
        return answer;
    }
}