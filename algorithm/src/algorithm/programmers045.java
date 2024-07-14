package algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class programmers045 {

	public static void main(String[] args) {
		Solution045 s=new Solution045();
		int[] answer=s.solution(5, new int[] {2,1,2,6,2,4,3,3});
		System.out.println(Arrays.toString(answer));
	}

}
class Solution045 {
    public int[] solution(int N, int[] stages) {
        int[] challenger = new int[N+2];
        
        for(int i=0; i<stages.length; i++){
            challenger[stages[i]]+=1;
        }
        
        HashMap<Integer,Double> fails=new HashMap<>();
        double total=stages.length;
        
        for(int i=1; i<=N; i++){
            if(challenger[i]==0) fails.put(i,0.);
            else{
                fails.put(i,challenger[i]/total);
                total-=challenger[i];
            }
        }
        
        return fails.entrySet().stream()
        		.sorted((o1,o2)->Double.compare(o2.getValue(), o1.getValue()))
        		.mapToInt(HashMap.Entry::getKey).toArray();
        
    }
}