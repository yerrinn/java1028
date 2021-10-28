
public class Array_1 {
	public static void main(String[] args) {
		
		//3개의 점수를 저장
		//묶어서 하나의 이름으로 저장 - 배열 
		int []scores = {90, 99, 87};
		
		//반복문 이용해서 배열 출력
		//배열은 반복문을 이용해서 모든 데이터에 접근할 수 있기 때문에 처리하는 문장이 간결해짐
		for(int i=0; i<scores.length; i=i+1) {
			System.out.println(scores[i]);
		}
		
		//더 간단하게 출력할 수 있음
//		for(int score : scores) {
//			System.out.println(score);
//		}

	
	
	}//main

}//class
