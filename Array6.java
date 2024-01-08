
public class Array6 {

	public static void main(String[] args) {
		 int tabla[] = new int[20];

	        // Los dos primeros valores de  Fibonacci
	        tabla[0] = 0;
	        tabla[1] = 1;

	        //calcular valores con frecuencia fibonnaci
		for(int i=2; i<20; i++) {
			tabla[1]= tabla[i-1] + tabla[i-2];
		}
		// mostar la tabla con los valores fibonnaci
		System.out.println("Valores de la frecuencia fibannaci:");
		for(int i=2; i<20; i++) {
			System.out.println(tabla[i] + " ");}
		}



	}