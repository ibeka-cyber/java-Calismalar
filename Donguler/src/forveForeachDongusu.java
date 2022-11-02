import java.util.Scanner;

public class forveForeachDongusu {
	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		for (int i : n) {
			System.out.println(i);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("5 sayı giriniz: ");
		int[] sayi = new int[5];
		for (int j = 0; j < sayi.length; j++) {
			sayi[j] = sc.nextInt();
		}
		for(int k : sayi) {
			if(k%2!=0)
			System.out.println(k);
		}

	}

}
