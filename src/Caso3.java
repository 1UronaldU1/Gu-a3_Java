import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1, mul = 1;
		String mensaje = ""; 
		
		System.out.println("Ingrese número: ");
		int num = sc.nextInt();
		
		if(num > 7) 
			mensaje = "El número es superior de 7";
			
		while (c <=num) {
			mul = mul * c;
			c++;
		}
		if(num <=7)
		mensaje = "El factorial de " + num + " es: " + mul;
		System.out.println(mensaje );
	}

}
