
public class Array8 {

	static boolean esIgual(int[] tabla) {
		for (int i = 0, j = tabla.length - 1; i < j; i++, j--) {
            // Comparamos los valores 
            if (tabla[i] != tabla[j]) {
                return false;

            }
        }

        // Si no se encontrar diferencia es igual
        return true;}

	public static void main(String[] args) {

		 int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};

		  boolean igual = esIgual(tabla);

		  if (igual) 
	            System.out.println("La secuencia es igual de izquierda-derecha y de derecha-izquierda.");
	         else 
	            System.out.println("La secuencia no es igual de izquierda-derecha y de derecha-izquierda.");
	}

}
