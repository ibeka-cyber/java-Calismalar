package arrays;

import java.util.Arrays;

public class tek_boyutlu {
	public static void main(String[] args) {

		int[] number = new int[16];// 16 elemanlı bir int dizi üretir

		System.out.println(Arrays.toString(number));// number dizisinin içeriğini yazdırarak görelim.
		number[5] = 32;
		System.out.println(number[5]);

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(numbers[5]);
		System.out.println(numbers.length);// dizi uzunluğunu verir.

		String[] names = new String[10]; // 10 elemanlı bir string dizi üretir.
		System.out.println(Arrays.toString(names));
		names[2] = "Bahar";
		System.out.println(Arrays.toString(names));
		names[4] = "Hasan";
		System.out.println(Arrays.toString(names));
		// names[14]="Ece"; hata verir. çünkü 14. index yok. max 10

	}

}
