package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel ";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayı = topla (10,7);
		System.out.println(sayı);
		

	}
	public static void ekle () {
		
		System.out.println("eklendi");
		
	} public static void sil () {
		
		System.out.println("silindi");
	}public static void güncelle () {
		
		System.out.println("güncellendi");
	}public static int topla (int sayı1,int sayı2) {
		 
		return sayı1+sayı2 ;
		
	}public static String sehirVer () {
		return "Ankara" ;
	}
}
