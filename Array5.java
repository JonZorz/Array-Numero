
public class Array5 {
	//Creamos el factorial
	static int factorial(int x) {
		int fact=1;
		for(int i=1;i<=x;i++)
			fact= fact*i;
		return fact;
	}
	

	public static void main(String[] args) {
		//Crear la tabla
		int tabla[]=new int[10];
		//Relleno de la tabla
		for(int i=0;i<tabla.length;i++)
			tabla[i]=factorial(i);
		//Mostramos en la pantalla
		for(int i=0;i<tabla.length;i++)
			System.out.println(i + ": " +tabla[i]);

	}

}
