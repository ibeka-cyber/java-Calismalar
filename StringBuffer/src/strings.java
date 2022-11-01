import java.util.Scanner;

public class strings {
	public static void main(String[] args) {
		// kullanıcıdan aldığımız ad soyadı StringBuffer kullanarak yazdıralım.
		Scanner sc = new Scanner(System.in);
		StringBuffer bf = new StringBuffer();
		System.out.print("adınız: ");
		bf.append("ad:");
		bf.append(sc.nextLine());
		System.out.print("soyadınız: ");
		bf.append(" , Soyad:");
		bf.append(sc.nextLine());
		System.out.println(bf.toString());
		System.out.println("****************************");

		String str1 = "hello";
		String str2 = "hello";
		// System.out.println(str1==str2); == operatörü iki değişkenin bellekteki
		// adreslerini karşılaştırmak için kullanılır.
		System.out.println(str1.equals(str2)); // equals iki strini tek tek karşılaştırarak aynı olup olmadığını bakar.

		str2 = "HELLO";
		System.out.println(str1.equalsIgnoreCase(str2));// equalsIgnoreCase metodu iki stringi büyüklük küçüklüğe
														// bakmadan karşılaştırmaya yarar.

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir yazı giriniz: ");
		String line = scan.nextLine();
		System.out.println(line.toUpperCase());
		System.out.println(line.length());
		System.out.println(line.replace('a', 'o'));// a'ları o yapar.
		System.out.println(line.substring(11));// 11.harften itibaren stringi yazar.
		System.out.println(line.isEmpty());// line stringi boş mu diye kontrol eder true false döndürür.

		System.out.println(line.indexOf('a'));// baştan kaçıncı sırada
		System.out.println(line.lastIndexOf('a'));// sondan kaçıncı sırada
		System.out.println(line.trim());// başındaki ve sonundaki boşlukları kırp

		Scanner sc1 = new Scanner(System.in);
		System.out.print("1.yazı : ");
		String st1 = sc1.nextLine();
		System.out.print("2.yazı : ");
		String st2 = sc1.nextLine();

		System.out.println(st1 + " " + st2);

	}
}