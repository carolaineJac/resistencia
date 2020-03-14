	package miprimerprograma;
	import java.util.Scanner;
	public class miprimerprograma {

		public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
			System.out.printf("Ingrese resistencia 1: ");
			float r1 = sc.nextFloat();
			System.out.printf("Ingrese resistencia 2: ");
			float r2 = sc.nextInt();
			System.out.printf("Ingrese resistencia 3: ");
			float r3 = sc.nextInt();
			
			if((r1 <= 0) || (r2 <=0) || (r3<=0)) {
			System.out.println("Las resistencias no son distintas a cero.");
				
				}
		
			float h = (float)(1/(1/r1) + (1/r2) + (1/r3));
			System.out.println("La resistencia total es de: "+h);
			
				}

			}
	
	
