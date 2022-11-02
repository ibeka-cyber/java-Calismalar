import java.util.Scanner;

public class DoWhileDongusu {

	public static void main(String[] args) {
		/*int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<10);*/
		
		//Parola kontrolü
		String password=null; 
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("parola: ");
			password= sc.nextLine();
		}while(!password.equals("123412"));
		System.out.print("Hoşgeldiniz! ");
	}

}
