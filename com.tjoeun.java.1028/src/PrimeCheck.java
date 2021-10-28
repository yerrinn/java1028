
public class PrimeCheck {
	public static void main(String[] args) {
		
		//su가 소수인지 확인하기
		int su = 11;
		boolean a = true; 
		
		for(int i=2; i<su; i=i+1) {
			if(su%i==0) {
				a = false;
				break;
			}
		}
		
		if(a==true) {
			System.out.println("소수");
		}else {
			System.out.println("소수아님");
		}
	}

}
