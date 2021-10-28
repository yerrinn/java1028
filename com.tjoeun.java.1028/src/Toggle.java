
public class Toggle {
	
	public static void main(String[] args) {
		
		//2초마다 2가지 동작(on-off)을 번갈아가면서 10번하기
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(2000);
			}catch(Exception e) {}
			if(i%2==0) {
				System.out.println("On");
			}else {
				System.out.println("Off");
			}
		}
		
		
		//오미크론, 라투, 다크스펙터 번갈아가면서 출력
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			if(i%3==0) {
				System.out.println("오미크론");
			}else if(i%3==1) {
				System.out.println("라투");
			}else {
				System.out.println("다크스펙터");
			}
		}
		
		
	}

}
