package algorithm;

import java.util.Scanner;

public class programmers030 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<b; i++){
            StringBuilder star=new StringBuilder();
            for(int j=0; j<a; j++){
                star.append("*");
            }
            System.out.println(star);
        }
    }
}
