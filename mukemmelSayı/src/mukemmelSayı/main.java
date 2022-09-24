package mukemmelSayı;

public class main {

	public static void main(String[] args) {
		int number = 25;
		int total = 0 ;
		
		for (int i=1;i<number;i++) {
			
			if (number % i == 0 ) {
				
				total = total+i ;
			
			}
			
			if (number==total) {
				
				System.out.print("Mükemmel Sayıdır.");
			}
			
		 else {
				
				System.out.print("Mükemmel Sayı değildir. ");
		}
			
	}
	}
	

}
