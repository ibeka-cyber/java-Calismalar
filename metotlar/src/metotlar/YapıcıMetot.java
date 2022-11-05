package metotlar;

public class YapıcıMetot {
	int x ;
	public YapıcıMetot() {
		System.out.println("yapıcı metot");
		x=20;
	}
	public static void main(String[] args) {
		
		Ogrenci ogrenci =new Ogrenci("İrem Bahar", "Koç",22);
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.soyad);
		System.out.println(ogrenci.yas);

		Ogrenci ogrenci2 =new Ogrenci();
		System.out.println(ogrenci2.isim);
		System.out.println(ogrenci2.soyad);
		System.out.println(ogrenci2.yas);

	}

}
