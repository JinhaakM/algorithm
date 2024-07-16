package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class programmers057 {

	public static void main(String[] args) {
		Solution057 s=new Solution057();
		int answer=s.solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3});
		System.out.println(answer);
	}

}
class Solution057 {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:tangerine){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> sortedCounts=new ArrayList<>(map.values());
        sortedCounts.sort(Collections.reverseOrder());
        
        int numTypes=0;
        int countSum=0;
        
        for(int count:sortedCounts){
            countSum+=count;
            numTypes++;
            if(countSum>=k) break;
        }
        return numTypes;
    }
}