
public class ejercicioSIETE {
	
		public static void main(String[] args) {
		
			int tabla [] =  { 2,6,2,77,3,10,23,14,45,78};
		
			int contadorPares = 0 ;
			int contadorImpares = 0;
			//Positivos
			for (int i = 0; i<tabla.length;i++) {
			if (tabla[i]%2==0)
				contadorPares++;
			}
			
			//Negativos
			for (int i = 0; i<tabla.length;i++) {
				if (tabla[i]%2 !=0)
					contadorImpares++;
			}	
			
			
			if (contadorPares<contadorImpares)
				System.out.println("Hay más impares");
		    if(contadorImpares<contadorPares)
					System.out.println("Hay más pares");
		    if (contadorImpares== contadorPares)
					System.out.println("Hay la misma cantidad de pares e impares");
		}
				
		}


