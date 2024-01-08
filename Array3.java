
public class Array3 {

	public static void main(String[] args) {
		
		 int tabla[]= {3,6,2,77,4,10,23,14};
		 boolean Diferentes = ((false) || (true));

		 //comparar los valores de la tabla
		 for (int i = 0; i < tabla.length; i++) 
		     for (int j = i + 1; j < tabla.length; j++) 
		         if (tabla[i] == tabla[j]);
		 System.out.println("¿Son todos los elementos del array diferentes? Respuesta: " + Diferentes);
	}
}