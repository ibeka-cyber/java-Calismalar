package metotlar;

import java.util.Scanner;

public class MetotlarDevam2 {
	public static String ad;

	public static void merhaba(String ad) {
		System.out.println("Merhaba " + ad);
	}

	public int max(int x, int y, int z) {
		if (x > y & x > z)
			return x;
		else if (y > x & y > z)
			return y;
		else
			return z;
	}

	/*
	 * public double max2(double x, double y,double z) { if(x>y & x>z) return x;
	 * else if (y>x & y>z) return y; else return z; }
	 */
	public static boolean bool(boolean a, boolean b, boolean c) {
		return (a && b) || (a && c) || (b && c);
	}

	public static boolean eq(int[] a, int[] b) {
		boolean result = false;
		if (a.length == b.length)
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i])
				result =false;
				else
					result=true;
			}
		else {
			result = false;
		}
		return result;
	}
	public double topla(int[] a) {
		double result=0;
		
		for(int i =0;i<a.length;i++) {
			result +=a[i];
		}
		return result;
	}
	
	
	public double ortalama(int[] dizi, double toplam) {
		double ortalama = (toplam/ dizi.length);
		return ortalama;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("ad: "); //ad değişkeni ve merhaba metodu static olduğu için
		 * nesne oluşturmadan erişilebildi. ad=sc.nextLine();
		 * MetotlarDevam2.merhaba(ad);
		 */

		MetotlarDevam2 m = new MetotlarDevam2();
		/*
		 * ouble mak1 = m.max2(5.4,4.5, 2.3); System.out.println(mak1);
		 */

		int mak2 = m.max(4, 3, 7);
		System.out.println(mak2);

		boolean bool = m.bool(false, true, true);
		System.out.println(bool);

		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = { 1, 2, 3, 4 };
		System.out.println(MetotlarDevam2.eq(x, y));
		System.out.println(m.topla(x));
		System.out.println(m.ortalama(x,m.topla(x)));


	}

}
