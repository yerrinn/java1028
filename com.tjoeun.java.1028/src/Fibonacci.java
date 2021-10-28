import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		//#피보나치 수열 문제 - 금융권에서 필수!!
		//1, 1, 2, 3, 5, 8, 13, 21, 34 ,,,
		//첫번째 수와 두번째 수는 무조건 1
		//세번째 수부터는 앞의 2개의 수를 더한 수
		
		//숫자입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int num = scan.nextInt();
		
		//초깃값 생성
		int first=0;
		int second=1;
		
		int i;
		
		//첫번째 1출력
		System.out.print(second + " ");
		
		for(i=0; i<num-1; i=i+1) {
			int third = first+second;
			System.out.print(third + " ");
			first = second;
			second = third;
			
		}//for문		
		
	}//main
}//class
