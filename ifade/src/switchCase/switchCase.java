package switchCase;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		int mevsim;
		
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Aylarını öğrenmek istediğiniz mevsimi seçiniz: \n 1)İlkbahar \n 2)Yaz \n 3)Sonbahar \n 4)kış");
		mevsim = scan.nextInt();

		switch (mevsim) {
		case 1:
			System.out.println("İlkbahar ayları: Mart, Nisan, Mayıs");
			break;
		case 2:
			System.out.println("Yaz ayları: Haziran, Tammuz, Ağustos");
			break;
		case 3:
			System.out.println("Sonbahar ayları: Eylül; Ekim, Kasım");
			break;
		case 4:
			System.out.println("Kış ayları: Aralık,Ocak,Şubat");
			break;
		default:
			System.out.println("Yanlış değer girdiniz!");}
			
			// kullanıcıdan alınan 2 sayıya temel operatörleri uygulamak
			Scanner sc = new Scanner(System.in);
			System.out.print("1.Sayı: ");
			float n1 = Float.parseFloat(sc.nextLine());
			System.out.print("2.Sayı: ");
			float n2 = Float.parseFloat(sc.nextLine());
			System.out.print("yapılacak işlemı: ");
			char choice = sc.nextLine().charAt(0);// klavyeden girilen ilk karakteri al

			switch (choice) {
			case '+':
				System.out.println("Sayıların toplamı: " + (n1 + n2));
				break;
			case '-':
				System.out.println("Sayıların farkı: " + (n1 - n2));
				break;
			case '*':
				System.out.println("Sayıların çarpımı: " + (n1 * n2));
				break;
			case '/':
				System.out.println("Sayıların bölümü: " + (n1 / n2));
				break;
			case '%':
				System.out.println("Sayıların modu: " + (n1 % n2));
				break;
			default:
				System.out.println("Bilinmeyen Operatör!");

			
		}

	}
}
