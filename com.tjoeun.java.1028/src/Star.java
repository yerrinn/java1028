
public class Star {

	public static void main(String[] args) {

		int i;

		//#1) *****출력
		System.out.println("#1 -------------");

		for(i=0; i<5; i=i+1) {
			System.out.print("*");
		}System.out.println();


		//#2)
		System.out.println("#2 -------------");

		for(i=0; i<5; i=i+1) {
			for(int j=0; j<5; j=j+1) {
				System.out.print("*");
			}System.out.println();
		}


		//#3)
		System.out.println("#3 -------------");

		for(i=0;i<5;i=i+1) {
			for(int j=0; j<i+1; j=j+1) {
				System.out.print("*");
			}System.out.println();
		}


		//#4)
		System.out.println("#4 -------------");

		for(i=0;i<5;i=i+1) {
			for(int j=0; j<5-i; j=j+1) {
				System.out.print("*");
			}System.out.println();
		}


		//#5)
		System.out.println("#5 -------------");

		for(i=0;i<5;i=i+1) {
			for(int j=0; j<2*i+1; j=j+1) {
				System.out.print("*");
			}System.out.println();
		}


		//#6)
		System.out.println("#6 -------------");

		for(i=0;i<5;i=i+1) {
			for(int j=0; j<9-2*i; j=j+1) {
				System.out.print("*");
			}System.out.println();
		}


		//#7)증가->감소문제
		System.out.println("#7 -------------");
		
		for(i=0; i<5; i=i+1) {
			if(i<3) {//증가부분
				for(int j=0; j<i+1; j=j+1) {
					System.out.print("*");
				}
			}else {//감소부분
				for(int j=2; j>0; j=j-1) {
					System.out.print("*");
				}
			}System.out.println();
		}System.out.println();
		
		
		//#8.공백있는 증가->감소 문제
		System.out.println("#8 -------------");
		
		

	}//main
}//class
