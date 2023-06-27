package diaDieciseisTarea;



public class Condicion {
	
	private int numero;
	
	public void setNumero(int numero) {
		this.numero = numero;
		
		
	}
	
	
	void condicion() {
		
		if (numero >0 ) {
			System.out.print("El numero es positivo");
	} if (numero <0 ){
		System.out.print("El numero es negativo");
	} if (numero == 0 ) {
		System.out.print("El numero es cero");
	}
		
	}
	
	

}
