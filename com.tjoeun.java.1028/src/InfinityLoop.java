
public class InfinityLoop {
	public static void main(String[] args) {
		
//		while(true) {  
//			System.out.println("무한반복");
//		}
		
		while(true) {
			try {
				Thread.sleep(5000); //5초대기 = 5초마다
			}catch(Exception e) {}
			System.out.println("무한 반복");
		}
	}
}
