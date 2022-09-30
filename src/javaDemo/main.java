package javaDemo;

public class main {

	public static void main(String[] args) {

		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println("-----------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "derin";
		ogrenciler[2] = "salih";
		ogrenciler[3] = "ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);

		}
// sonuncu yazdığım daha profesyonel
		System.out.println("------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
