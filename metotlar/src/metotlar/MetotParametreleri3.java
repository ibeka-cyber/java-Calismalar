package metotlar;

import java.util.Arrays;

public class MetotParametreleri3 {
	public static void main(String[] args) {
		

		MetotParametreleri3 m = new MetotParametreleri3();
		m.test(5);
		m.Args(new int[] {4,5});
		m.Args2(2, 1,2,3,4,5);// 2 den sonraki sayıları int dizisine atar ve o şekilde işlem yapar.
	}

	public void test(final int x) { //final sözcüğü yazıldıktan sonra alttaki x in altı kırmızı çizildi. yani olamaz dedi.
		//x=10;
		System.out.println(x);//final sözcüğü yazılmazsa metot xi 10 olarak değerlendirir ve yazdırır.
		
	}
	
	public void Args(int[] num) { //[] yerine üç nokta koyabiliriz.
		int x=num[0];
		int y=num[1];
		
		System.out.println(x+y); 
	}
	public void Args2(int a,int... num) {
		int x=num[0];
		int y=num[1];
		
		System.out.println(a*x+a*y);
	}
}
