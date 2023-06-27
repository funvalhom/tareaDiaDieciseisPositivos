package diaDieciseisTarea;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Condicion valores = new Condicion();
		
		Scanner dato= new Scanner(System.in);
		System.out.print("Ingrese el valor: ");
		int numero = dato.nextInt();
		
		valores.setNumero(numero);
		valores.condicion();
		
		
		
		
		

	}

}
