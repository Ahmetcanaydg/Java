package stringsDemo;

public class main {

	public static void main(String[] args) {
	String mesaj = "    Bugün hava çok güzel.   ";
    System.out.println(mesaj);
//	System.out.println("Eleman sayısı : "+mesaj.length());
//	System.out.println("5. eleman : "+mesaj.charAt(4));
//	System.out.println(mesaj.concat("Yaşaşın ! "));
//	System.out.println(mesaj.startsWith("B"));
//	System.out.println(mesaj.endsWith("."));
//	char [] karakterler = new char [5];
//	mesaj.getChars(0, 5, karakterler, 0);
//	System.out.println(karakterler);
//	System.out.println(mesaj.indexOf("ç"));
//	System.out.println(mesaj.lastIndexOf("a"));
	
     String yeniMesaj = mesaj.replace(' ', '-');
     System.out.println(yeniMesaj);
     System.out.println(mesaj.substring(1,5));
     
     for (String kelime : mesaj.split (" ")) {
    	 
    	 System.out.print(yeniMesaj);
    	 
     }
     
     System.out.print(mesaj.toLowerCase());
     System.out.print(mesaj.toUpperCase());
     System.out.print(mesaj.trim());	
	
	
	
	}

}
