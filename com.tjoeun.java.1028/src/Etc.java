
public class Etc {
	public static void main(String[] args) {

		//1부터 10까지 출력하는 반복문
		//1,2,3,4,5,6,7,8,93의 배수가 되면 반복문 종료
		//3이 되면 반복문을 더 이상 수행하지 않고 종료
		for(int i=1; i<11; i=i+1) {
			if(i%3 == 0) {
				break;
			}
			System.out.print(i+ " ");
		}System.out.println();
		System.out.println("----------------------");


		//continue
		//3의배수 빼고 출력
		for(int i=1; i<11; i=i+1) {
			if(i%3 == 0) {
				continue;
			}
			System.out.print(i+ " ");
		}

	}

}
