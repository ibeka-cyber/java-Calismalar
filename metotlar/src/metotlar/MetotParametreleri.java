package metotlar;

public class MetotParametreleri {
	public static void main(String[] args) {
		int x = 20;
		System.out.println(x); // yukarıdan aşağı okurken bir üstteki x değeri yazdırılır.
		MetotParametreleri m = new MetotParametreleri();
		m.passByValue(x);// burada 13. satıra gider program
		System.out.println(x); // burada değer 20 olur çünkü artık metot içinde çıktık main kısmına geldik.
								// Yani orda olan orda kalır.

	}

	public static void passByValue(int x) {// x değeri 20 olarak gönderildi
		System.out.println("PBV: " + x);// değer değişmediği için ekrana 20 yazdırılır.
		x = 10; // metot içinde değer 10 oldu
		System.out.println("PBV: " + x);// ekrana 10 yazdırılır. burada iş bittiği için program 9.satıra döner.
	}
}
