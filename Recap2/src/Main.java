
public class Main {

	public static void main(String[] args) {
	double [] myList = {1.2,6.9,4.3,5.6 };
	double total = 0 ;
	double max = myList [0];
	for (double number : myList ) {
		if (max<number) {
			max = number ;
			
		}
		total = total+number;
		
		System.out.print(number);
	
		
		
	}
	
	System.out.print("Toplam = " + total);
	System.out.print("En Büyük  = " + max);

	}

}
