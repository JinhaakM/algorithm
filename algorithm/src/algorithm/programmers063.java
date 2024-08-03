package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class programmers063 {

	public static void main(String[] args) {
		Solution063 s=new Solution063();
		int[] answer=s.solution(
				new String[] {"may", "kein", "kain", "radi"},
				new int[] {5,10,1,3}, 
				new String[][] {{"may", "kein", "kain", "radi"},
								{"may", "kein", "brin", "deny"}, 
								{"kon", "kain", "may", "coni"}}
				);
		System.out.println(Arrays.toString(answer));
		}
	}

class Solution063 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> map=new HashMap<>();
        int total=0;
        
        for(int i=0; i<name.length; i++){
            map.put(name[i],yearning[i]);
        }
        for(int j=0; j<photo.length; j++){
            for(int k=0; k<photo[j].length; k++){
                if(map.containsKey(photo[j][k])){
                total+=map.get(photo[j][k]);
                }
            }
            answer[j]=total;
            total=0;
        }
        
        return answer;
    }
}