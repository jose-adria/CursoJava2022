package modulo3;
import java.util.*;

public class Modulo3_Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese una de las siguientes letras A,B,C");
		String entradaTeclado = " ";
		Scanner entradaEscaner = new Scanner (System.in);
		entradaTeclado = entradaEscaner.nextLine();
		entradaEscaner.close();
	System.out.println("["+entradaTeclado+"]");
		if ( "A".equalsIgnoreCase(entradaTeclado))  {
			System.out.println("tu eres el hijo");
			}
		else
		{
			if (  "B".equalsIgnoreCase(entradaTeclado)) {
				System.out.println("tu eres el padre");
			}
			else
			{	
				if (  "C".equalsIgnoreCase(entradaTeclado)) {
					System.out.println("tu eres el abuelo");
				}
		    		else {	
					System.out.println("no es correcta la letra");
				}	
				
			}
		}
	}

}
