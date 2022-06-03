package modulo4;

import java.util.Scanner;

public class Modulo4_Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese un valor que quiera saber su tabla de multiplicar:");
		String entradaTeclado = " ";
		float valor = 0;
		Scanner entradaEscaner = new Scanner (System.in);
		entradaTeclado = entradaEscaner.nextLine();
		entradaEscaner.close();
		try {
			float numeroTeclat = Float.valueOf(entradaTeclado) ;

			for (int i= 0; i < 11;++i) {
				 valor = i * numeroTeclat;
				 System.out.println(entradaTeclado+"*"+i+"="+valor);
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no se pueden multiplicar letras"+e.getMessage());
		}
		https://gitlab.com/gcasas1972/cursojava_mayo2022_codigo.git 
		// codigo del profe 
	 
System.out.println("Fin del proceso");		
	}

}
