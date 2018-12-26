package practice01;
import java.util.Scanner;
public class Prob3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in );
		int sum1 = 0;
		int sum2 = 0;
		int n ;
		while(true) {
			sum1 = 0;
			sum2 = 0;
		System.out.print("숫자를 입력하세요: ");
		n = s.nextInt();
		for(int i = 0 ; i<=n ; i++) {
			if(i%2 == 0) {
				sum1 += i; 
			}else if(i%2 == 1) {
				sum2 += i;
			}
		}
		
		System.out.print("결과 값 : ");
		if(n%2 == 0) {
			System.out.println(sum1);	
		}else if(n%2 == 1) {
			System.out.println(sum2);	
		}
		
		}
		
		
	}
}
