
public class ConsolInput {
	public static void main(String[] args) {

		//키보드로 입력받을 수 있는 인스턴스 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);

		//문자열 입력받기
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("이름 : " + name);

		//정수 입력받기
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		System.out.println("점수 : " + score);
		
		//문자열 입력받기
		System.out.print("별명을 입력하세요: ");
		sc.nextLine(); //버퍼에 남아있는 내용지우기
		String nick = sc.nextLine();
		System.out.println("별명 : " + nick);

		sc.close();
	}

}
