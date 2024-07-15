package algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class programmers049 {

	public static void main(String[] args) {
		Solution049 s=new Solution049();
		int[] answer=s.solution
				(new String[] {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"}, 
				 new String[] {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"}, 
				 new String[] {"young", "john", "tod", "emily", "mary"}, 
				 new int[] {12, 4, 2, 5, 10});
		System.out.println(Arrays.toString(answer));
	}

}

class Solution049 {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        
        HashMap<String,String> parent=new HashMap<>();
        for(int i=0; i<enroll.length; i++){
            parent.put(enroll[i], referral[i]);
        }
        
        HashMap<String,Integer> total=new HashMap<>();
        
        for(int i=0; i<seller.length; i++){
            String curName=seller[i];
            int money=amount[i] * 100;
            while(money>0 && !curName.equals("-")){
                total.put(curName, total.getOrDefault(curName,0)+money-(money/10)); 
                curName=parent.get(curName);
                money/=10;
            }
        }
        int[] answer=new int[enroll.length];
        for(int i=0; i<enroll.length; i++){
            answer[i]=total.getOrDefault(enroll[i],0);
        }
        return answer;
    }
}