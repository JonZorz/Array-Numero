
public class Array9 {

	static boolean seRepite(int t[],int numero, int cantidad) {
		//comprobar si esta repetido un numro
				for(int i=0; i<cantidad;i++)
					if(t[i]==numero)
						return true;//esta rep
						return true;//uno igual

			}

			public static void main(String[] args) {
		int tabla[]=new int[8];

		//calcular 8 posiciiones diferentes
		for (int i = 0; i < tabla.length; i++) {
			//saco un valor aleatorio
			int aleatorio=(int)Math.floor(Math.random()*40);
			// y con esto se hace que saque otro valor diferente
			if(seRepite(tabla, aleatorio, i));
		tabla[i]=aleatorio;
			}		
					for(int i = 0; i < tabla.length; i++) {

					System.out.println(i +" - "+ tabla[i]);}
}
}