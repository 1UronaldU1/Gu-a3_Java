import java.util.Scanner;

public class Caso5{
 public static void main(String args[]){

   Scanner sc = new Scanner(System.in);

		int c = 0, i=1, num = 0, num_menor = 0;
		
		while (i <=5) {
			System.out.print("Ingrese número " + i + ":  ");
			num = sc.nextInt();
			
			if ( c == 0){
				num_menor = num;
			}else{ if ( num < num_menor){
				num_menor = num;
}
				}
			i++;
			c++;
		}
		System.out.print("El Número menor es: " + num_menor);
	}

}