
public class Operatorler {
	public static void main(String[] args) {
		int a=5;
		int b=7;
		
		System.out.println("toplam: "+(a+b));
		System.out.println("çıkarma: "+(a-b));
		System.out.println("Bölme:"+(a/b));
		System.out.println("Çarpma: "+(a*b));
		System.out.println("mod: "+(a%b));
		
		int i=10; //bellekteki hali 00000000 00000000 00000000 00001010
		int x=4;// bellekteki hali  00000000 00000000 00000000 00000100
		
		System.out.println(~i);//~ yani not 0 gördüğü bitleri 1,1 leri 0 yapar.
		//sonucun -11 olmasının sebebi yukarıdaki en soldaki bit yani 32. bit 1 ise sayı negatif demektir.(2nin tümleyeninden)
		
		System.out.println(i&x);
		// end operatöründe sadece ikisi de 1 ise sonuç 1 olur. diğer ihtimallerde 0
		
		System.out.println(i|x);
		// or operatöründe sadece ikisi de 0 ise sonuç 0 olur. diğer ihtimallerde 1
		
		System.out.println(x>>1);
		// sayıyı sağa doğru kaydırmak demek
		
		/* eski:00000000 00000000 00000000 00000100
		   yeni:00000000 00000000 00000000 00000010 yeni değer:2 oluyor
		   yani bir int sayıyı 1 basamak sağa kaydırmak demek onu 2 ye bölmek demektir.
		*/
		System.out.println(x<<1);//sola doğru kaydırma
		/* eski:00000000 00000000 00000000 00000100
		   yeni:00000000 00000000 00000000 00000100 =8  
		*/
		
		System.out.println("***************** İlişkisel operatörler **********************");
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		boolean c= a==b;
		System.out.println(c);
		System.out.println(c && false);
		/*önce soldaki değere bakılır. soldaki değer true ise sağa bakılır. false ise sonuç direkt false olur.
		 ilk değer true ise iki değer and lenir ve sonuç yazdırılır.
		*/
		System.out.println();
		
		
		
	}
}
