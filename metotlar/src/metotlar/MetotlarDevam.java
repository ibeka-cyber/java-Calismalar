package metotlar;

import java.util.Scanner;

public class MetotlarDevam {
	public void merhaba(String ad) {
		System.out.println("Merhaba "+ ad);
	}
	public void topla(int x, int y) {
		System.out.println("Toplam "+ (x+y));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MetotlarDevam met = new MetotlarDevam();
		
		System.out.print("Adınızı giriniz: ");
		String ad = sc.nextLine();
		met.merhaba(ad);
		
		//kullanıcıdan 2 sayı alarak toplama işlemi yaptırabiliriz.
		System.out.print("iki sayı giriniz: ");
		met.topla(sc.nextInt(),sc.nextInt());
		
		//carp metodu static olduğu için diğer sınıftan erişebildik. 
		HesapMakinesi.Carp(5,30);
		/*topla metodu static olmadığı için ulaşamadı.
		HesapMakinesi.topla(4,5);*/
		
		
	}
}
