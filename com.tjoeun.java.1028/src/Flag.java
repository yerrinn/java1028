
public class Flag {
	
	public static void main(String[] args) {
		
		//2가지 상태 번갈아가면서 10번 수행하기
		boolean flag = true;
		
		for(int i=0; i<10; i=i+1) {
			if(flag==true) {
				System.out.println("깃발 들어");
			}else {
				System.out.println("깃발 내려");
			}
			try {
				Thread.sleep(1000); 
			}catch(Exception e) {}
			
			flag = !flag; //true와 false를 번갈아가면서 flag에 저장
	
		}//for문
	}//main

}//class
