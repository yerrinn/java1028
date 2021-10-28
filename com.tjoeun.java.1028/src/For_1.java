
public class For_1 {
	
	public static void main(String[] args) {
		
		//Hello world 3번 출력
		for(int i=0; i<3; i++) {
			System.out.println("Hello world");
		}System.out.println("------------------");
		
		
		//image1.png, image2.png, image3.png를 for을 이용해서 출력
		for(int j=1; j<4; j++) {
			System.out.println("image" + j +".png");
		}//for문에서 만든 변수는 for문 바깥에서 사용할 수 없음
		//System.out.println(j);
		System.out.println("------------------");
		
		
		// ,를 써서 실행문을 2개 쓸 수 있음
		int i,j;
		for(i=0,j=0; i<3; i=i+1, j=j+1) {
			System.out.println("for");
		}System.out.println("------------------");
		
		
		
	}

}
