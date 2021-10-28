
public class Random {
	public static void main(String[] args) {
		
		java.util.Random rd = new java.util.Random();
		
		for(int i=0; i<5; i=i+1) {
			int x = rd.nextInt(100);
			System.out.println(x);
		}
		
	}

}
