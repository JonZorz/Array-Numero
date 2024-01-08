
public class Array7 {

	public static void main(String[] args) {
		int tabla[]= {3,6,2,77,3,10,23,14};

        //  contadores para números pares e impares
		int numpares=0;
		int numimpar=0;

		//sacamos los pares
		for(int i = 0; i < tabla.length; i++) 
			if(tabla[i]% 2 == 0)

				//para contar pares
				numpares++;
			else 
		//por si no es par para q sea impar
		numimpar++;

		System.out.println("Hay " + numpares+" numpares");
		System.out.println("Hay " +( tabla.length-numimpar)+" numimpar");
		System.out.println("hay la misma cantidad de impares que de pares");
	}

}
