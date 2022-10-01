package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel ";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayı = topla (15,7);
		System.out.println(sayı);
		int toplam = topla2(2,3,4,5,6,10);		
		System.out.println (toplam);

	}
	public static void ekle () {
		
		System.out.println("eklendi");
		
	} public static void sil () {
		
		System.out.println("silindi");
	}public static void güncelle () {
		
		System.out.println("güncellendi");
	}public static int topla (int sayı1,int sayı2) {
		
		return sayı1+sayı2 ;
		
	}public static int topla2 (int...sayılar) {
		int toplam = 0;
	for (int sayı:sayılar ) {
		
		toplam+=sayı ;
		
	}return toplam;
		
		
	}
		 
	
	
	
	
	public static String sehirVer () {
		return "Ankara" ;
	}
}
