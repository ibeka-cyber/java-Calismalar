package metotlar;

public class Metotlar {
	
	public void Hello(){
		System.out.println("Hello My Friend!");
	}
	/*metotlar classında 4 tane aynı isimli metot olmasına rağmen hata almayız. Çünkü metotların parametreleri farklı.*/
	public void Topla(int x,int y) {
		int sonuc = x+y;
		System.out.println("int Toplam sonucu: "+sonuc);
	}
	public void Topla(float x,int y) {
		float sonuc = x+y;
		System.out.println("int float Toplam sonucu: "+sonuc);
	}
	public void Topla(float x,float y) {
		float sonuc = x+y;
		System.out.println("float float Toplam sonucu: "+sonuc);
	}
	public static void main(String[] args) {
	    new Metotlar().Hello();
	    new Metotlar().Topla(5, 7);
	    new Metotlar().Topla(4.5f, 7);
	    new Metotlar().Topla(5f, 7f);
	}

}
