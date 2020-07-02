import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int c =0,aptos=0,noaptos=0;
		String rpta="S",estado="",alumno1="",alumno2="";
		float pro1=0,pro2=0,pro3=0,prom=0,porcentaje=0,prom_mayor=0,prom_menor=0;

		while (rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("Datos del registro: "+c);
			System.out.println("======================");
			
			System.out.println("Ingrese nombre del alummno: ");
			String alumno= sc.nextLine();
		
			System.out.println("Ingrese nota 1:");
			int nota1= sc.nextInt();
			System.out.println("Ingrese nota 2:");
			int nota2= sc.nextInt();
			System.out.println("Ingrese nota 3:");
			int nota3= sc.nextInt();
		
			System.out.println("Número de asistencias [1-12]: ");
			int asistencia= sc.nextInt();
			
			pro1=nota1*0.2f;
			pro2=nota2*0.3f;
			pro3=nota3*0.5f;
			prom=pro1+pro2+pro3;
			
			porcentaje=asistencia*100/12;
			
			if (prom>=13 && porcentaje>=70) {
				estado="Obtiene certificado";
				aptos++;
			}else {
				estado="Sin certificado";		
				noaptos++;
			}
			
			System.out.println("Estado: "+ estado);
			
			sc.nextLine();
			
			System.out.println("RESULTADO");
			System.out.println("=========");
			System.out.println("Promedio: "+prom);
			System.out.println("Asistencia: "+porcentaje+"%");
			System.out.println("Estado: "+estado);
			System.out.println("¿Desea continuar?");
			rpta=sc.nextLine();
			
			if (c==1) {
				prom_menor = prom;
				alumno2 = alumno;
			}	
				
			if (prom > prom_mayor) {
				prom_mayor = prom;
				alumno1 = alumno;
			}
			if (prom < prom_menor) {
				prom_menor = prom;
				alumno2 = alumno;
			}
		}
					
			
	
		
		System.out.println("RESUMEN");
		System.out.println("=======");
		System.out.println("Número de participantes: "+c);
		System.out.println("Mayor promedio: "+prom_mayor+" Pertenece a: "+alumno1);
		System.out.println("Menor promedio: "+prom_menor+" Pertenece a: "+alumno2);
		System.out.println("Número de alumnos certificados: "+aptos);
		System.out.println("Número de alumnos sin certificado: "+noaptos);
	}

}