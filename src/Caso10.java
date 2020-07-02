import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c=0, horas=0, tarifa=0, min=0,aptos=0;
		String rpta="S",estado="",empleado="";
		double sb=0,bono=0,sn=0,des=0,alcanzado=0;

		while (rpta.equals("S") || rpta.equals("s")) {
			c++;

   			System.out.println("********************************");
   			System.out.println("Registro de Empleados ("+c+")");
   			System.out.println("********************************");
			
			System.out.print("Empleado: ");
			String nombre= sc.nextLine();
		
			System.out.print("Horas trabajadas: ");
			horas= sc.nextInt();
			System.out.print("Tarifa por hora: ");
			tarifa= sc.nextInt();
			System.out.print("Minutos de tardanza: ");
			min= sc.nextInt();
					
			sb=horas*tarifa;
					
			if (horas<=50) {
				bono=0;
				aptos++;
			}else if (horas>50 && horas<=60) {
				bono=sb*0.02;
				aptos++;
			}else if (horas>60 && horas<=70) {
				bono=sb*0.08;
				aptos++;
			}else if (horas>70 && horas<=80) {
				bono=sb*0.13;
				aptos++;
			} else if (horas>80) {
				bono=sb*0.25;
				aptos++;
			}


			if (min<=15) {
				des=0;
				aptos++;
			}else if (min>15 && horas<=300) {
				des=sb*0.02;
				aptos++;
			}else if (horas>60 && horas<=70) {
				bono=sb*0.08;
				aptos++;
			}
			sn = (sb + bono) - des;

			if (horas<=80) {
				alcanzado=horas*100/80;
				aptos++;

			}
			sc.nextLine();
			
			System.out.println("******************");
   			System.out.println("    Resultados    ");
   			System.out.println("******************");
			System.out.println("Sueldo bruto : "+sb);
			System.out.println("Bonificación : "+bono);
			System.out.println("Descuento    : "+des);
			System.out.println("Sueldo neto  : "+sn);
			System.out.println("% Alcanzado  : "+alcanzado+"%");
			System.out.println("********************************");
   			System.out.print("¿Nuevo Empleado? [S/N]: ");
			rpta=sc.nextLine();

		}			
	}

}