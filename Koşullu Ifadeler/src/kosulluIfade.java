import java.util.Scanner;

public class kosulluIfade {
	static void main(String[]args) {
		int yas;
		Scanner sc = new Scanner(System.in);
		System.out.println("yaşınızı giriniz: ");
		yas=sc.nextInt();
		
		if(yas<0) {
			System.out.println("yaş negatif olamaz!");
		}
		else if(yas<18){
			System.out.println("Ehliyet alabilmek için 18 yaşını doldurmuş olmanız gerekmektedir!");
		}
		else {
			System.out.println("Ehliyet alabilirsiniz!");
		}
	}

}
