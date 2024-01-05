import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int x, a, b, c;
		double y, b1, b2, h, area, resultado, d;
		
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(String.format("%.1f", y));
		
		
		//calculando a área de um trapézio;
		b1 = 5.5;
		b2 = 3.9;
		h = 2.0;
		area = (b1 + b2) / 2 * h;
		System.out.println(area);
		
		// casting em Java 
		a = 5;
		b = 7;
		resultado = (double)a / b;
		System.out.println(String.format("%.4f", resultado));
		
		// Casting em java (Trocando double por int);
		d = 5.0;
		c = (int)d;
		System.out.println(c);
		
	}

}
