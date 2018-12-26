package practice01;

public class Prob5 {

	public static void main(String[] args) {
		String str = new String();
		for(int i = 1 ; i <= 1000 ; i++) {
			str = String.valueOf(i);
			
			if(str.contains("3")||str.contains("6")||str.contains("9")) {
				System.out.print(i+" ");
			for(int j=0; j < str.length() ; j++) {
				if(str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
					System.out.print("짝");
				}
			}
			System.out.println();
			}
		}
	}
}
