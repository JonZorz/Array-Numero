
public class Array10 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};

		 int contador = 0;
		//sacar los valores divisibles entre 7 de la tabla
		  for (int i = 0; i < tabla.length; i++) {
	            if (tabla[i] % 7 == 0) {
	                contador++;

	            }}System.out.println("¿Cuántos valores hay divisibles entre 7?: "+contador);


	}

}
