import java.time.DayOfWeek;
import java.time.Month;

public class Enum {
public static void main(String[] args) {
		Aylar ay=Aylar.Ocak;
		System.out.println(ay);
		
		ay=Aylar.Ekim;
		System.out.println(ay);
		
		Aylar[] values=Aylar.values();
		for(int i=0;i<values.length;i++) {
		System.out.println(values[i]);
		}
		Aylar value=Aylar.valueOf("Şubat");
		System.out.println(value);
		
		DayOfWeek sunday = DayOfWeek.SUNDAY;
		System.out.println(sunday);
		
		//herhangi indexteki değere ulaşmak için of kullanıyoruz.
		DayOfWeek of=DayOfWeek.of(3);
		System.out.println(of);
		
		Month february=Month.FEBRUARY;
		System.out.println(february);
	}
}
