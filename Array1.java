
public class Array1 {

	public static void main(String[] args) {
		//Creamos la tabla
		int tabla[]= {3,6,2,77,3,10,23,14};
		//Agregamos un contador
		int contador = 0;
		//Calcula los 3
		for(int i = 0; i<tabla.length;i++) 
			if(tabla[i]== 3) 
				contador++;
		//Mostramos en pantalla
		System.out.println("La cantidad de 3 son: " + contador);
	}
}