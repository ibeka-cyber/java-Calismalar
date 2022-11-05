package metotlar;

import java.util.Arrays;

public class MetotParametreleri4 {
	public static void main(String[] args) {

		Ogrenci ogrenci = new Ogrenci();
		ogrenci.isim = "tuğrul";
		ogrenci.yas = 8;

		MetotParametreleri4 m = new MetotParametreleri4();
		m.ogrenciBilgileri(ogrenci);

		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);

	}

	public void ogrenciBilgileri(Ogrenci ogrenci) { // ogrencinin başına final getirirsek o ogrenci değiştirilemez
													// anlamına gelir.ve ogrenci =new Ogrenci(); satırı hata verir.

		ogrenci = new Ogrenci();// yeni nesne oluşturulmazsa metot içerisinde yapılan değişiklik ikisine de
								// yansır.
		ogrenci.isim = "Ertuğrul";

		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);

	}
}
