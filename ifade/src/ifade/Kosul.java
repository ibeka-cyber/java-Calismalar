package ifade;

import java.util.Scanner;

public class Kosul {

	public static void main(String[] args) {

		int yas;
		int number;
		// ehliyet kontrolü
		Scanner sc = new Scanner(System.in);
		System.out.print("yaşınızı giriniz: ");
		yas = sc.nextInt();

		if (yas < 0) {
			System.out.println("yaş negatif olamaz!");
		} else if (yas < 18) {
			System.out.println("Ehliyet alabilmek için 18 yaşını doldurmuş olmanız gerekmektedir!");
		} else {
			System.out.println("Ehliyet alabilirsiniz!");
		}

		// negatif pozitif tek çift sayı kontrolü
		System.out.print("Bir sayı giriniz: ");
		number = sc.nextInt();

		if (number < 0) {
			if (number % 2 == 0)
				System.out.println("Negatif çift Sayı girdiniz!");
			else {
				System.out.println("Negatif tek Sayı girdiniz!");
			}
		} else {
			if (number % 2 == 0) {
				System.out.println("Pozitif çift Sayı girdiniz!");
			} else {
				System.out.println("Pozitif tek Sayı girdiniz!");

			}
		}

		// girilen sayın kaç basamaklı olduğunu veren program
		int sayi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Basamağı söylenecek sayıyı giriniz: ");
		sayi = scan.nextInt();

		if (sayi < 100) {
			if (sayi < 100)
				System.out.println("Girdiğiniz sayı 2 basamaklıdır.");
			else
				System.out.println("Girdiğiniz sayı 1 basamaklıdır.");
		} else if (sayi < 1000 & sayi >= 100) {
			System.out.println("Girdiğiniz sayı 3 basamaklıdır.");
		} else if (sayi < 10000 & sayi >= 1000) {
			System.out.println("Girdiğiniz sayı 4 basamaklıdır.");
		} else if (sayi < 100000 & sayi >= 10000) {
			System.out.println("Girdiğiniz sayı 5 basamaklıdır.");
		} else {
			System.out.println("çok büyük sayı girdiniz!");
		}

	}

}
