
public class Main {

	public static void main(String[] args) {
		char grade = 'H' ;
		
		switch (grade) {
		case 'A' : 
		  System.out.println("Mükemmel : GEçtiniz ") ;
		  break ;
		case 'B' :
		 System.out.println("Güzel  : GEçtiniz ") ;
		  break ;
		case 'C' :
		 System.out.println(" İyi  : GEçtiniz ") ;
		  break ;
		  
		case 'D' :
		 System.out.println(" Fena Değil : GEçtiniz ") ;
		  break ;
		case 'F' :
		   System.out.println(" Maalesef Kaldınız ") ;
		  break ;
		  default :
		  System.out.println("Geçersiz Bir Harf Girdiniz") ;
		}
	}

}
