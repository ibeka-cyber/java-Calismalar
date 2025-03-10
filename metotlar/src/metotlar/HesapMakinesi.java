package metotlar;

public class HesapMakinesi {
	public void Topla(float x, float y) {
		float sonuc = x + y;
		System.out.println("Toplam işleminin sonucu: " + sonuc);
	}

	public void Cikar(float x, float y) {
		float sonuc = x - y;
		System.out.println("Fark işleminin sonucu: " + sonuc);
	}

	public static void Carp(float x, float y) {
		float sonuc = x * y;
		System.out.println("Çarpma işleminin sonucu: " + sonuc);
	}

	public void Bol(float x, float y) {
		if (x == 0 | y == 0) {
			System.out.println("Sayılardan herhangi biri sıfır olamaz!");
		} else {
			float sonuc = x / y;
			System.out.println("Bölme işleminin sonucu: " + sonuc);
		}
	}

	public void Mod(float x, float y) {
		float sonuc = x % y;
		System.out.println("Mod alma işleminin sonucu: " + sonuc);
	}

	public static void main(String[] args) {
		HesapMakinesi m = new HesapMakinesi();
		m.Cikar(7.8f, 5.3f);
		m.Topla(6.7f, 9.6f);
		m.Bol(250.5f, -5.4f);
		m.Carp(6.7f, 1.2f);
		m.Mod(3.2f, 2.1f);
	}

}
