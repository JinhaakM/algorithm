package algorithm;

import java.util.ArrayDeque;
import java.util.Arrays;

public class programmers047 {

	public static void main(String[] args) {
		Solution047 s=new Solution047();
		String[] cards1= {"i", "drink", "water"};
		String[] cards2= {"want", "to"};
		String[] goal= {"i", "want", "to", "drink", "water"};
		String answer=s.solution(cards1, cards2, goal);
		System.out.println(answer);
	}

}
class Solution047 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        ArrayDeque<String> cardsDeque1=new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2=new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque=new ArrayDeque<>(Arrays.asList(goal));
        
        while(!goalDeque.isEmpty()){
            if(!cardsDeque1.isEmpty() && cardsDeque1.peekFirst().equals(goalDeque.peekFirst())){
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            }else if(!cardsDeque2.isEmpty() && cardsDeque2.peekFirst().equals(goalDeque.peekFirst())){
                cardsDeque2.pollFirst();
                goalDeque.pollFirst();
            }else{
                break;
            }
        }
     return goalDeque.isEmpty() ? "Yes" : "No";
    }
}