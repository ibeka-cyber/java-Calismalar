package staticDegiskenler;
import static java.lang.Math.PI;
public class staticD {

	static int ver;
	static {
		ver = 5;
	}

	static int j = 15; // başında static olmazsa main bu değişkene ulaşamaz.
	int i = 15;

	public static void main(String[] args) {
		staticD.j = 18; // static olduğu için nesne oluşturmadan kullanabildik.
		System.out.println("statik olan j: " + j);

		// veya 2. olarak bir nesne oluşturup i ye ulaşabiliriz.
		staticD statik = new staticD();
		statik.i = 10;
		System.out.println("statik olmayan i: " + statik.i);

		// static blok tanımlandığı için vere ulaşabildi.
		System.out.println("statik olmayan ver: " + ver);
		
		//Math sınıfı içerisindeki tüm metotlar ve değişkenler static olarak tanımlanmıştır. nesne oluşturmadan ulaşılabilir.
		System.out.println(Math.PI);

		//Math sınıfını import ederek Math yazmadan PI'ye erişebiliriz.
		System.out.println(PI);
		
		//sqrt sayıların karekökünü alır.
		System.out.println(Math.sqrt(9));
		
		//2 nin 3.kuvvetini yani küpünü yazdırır.
		System.out.println(Math.pow(2,3));
		
		//sayılardan küçük olanı yazdırır.
		System.out.println(Math.min(9,2));
		
		//sayılardan büyük olanı yazdırır.
		System.out.println(Math.max(9,2));
		
		float f= 1.6f; 
		//ceil kendisine verilen sayıyı yukarı yuvarlar
		System.out.println(Math.ceil(f));
		
		//floor kendisine verilen sayıyı aşağıya yuvarlar
		System.out.println(Math.floor(f)); 
		
		//round kendisine verilen sayı buçuktan küçükse ağaşı büyükse yukarı yuvarlar
		System.out.println(Math.round(f)); 

		//0-1 arasında rastgelebir sayı döndürür.
		System.out.println(Math.random()); 
		
		//0-10 arasında rastgelebir sayı döndürür.
		System.out.println(Math.random()*10);

	}

}
