package metotlar;

import java.util.Arrays;

public class MetotParametreleri2 {
	public static void main(String[] args) {
		int[] x = { 20, 30, 40, 50, 60 };

		MetotParametreleri2 m = new MetotParametreleri2();
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(m.ikiKati(x)));
	}

	public int[] ikiKati(int[] x) {

		for (int i = 0; i < x.length; i++) {
			x[i] = x[i] * 2;
		}
		return x;
	}
}
