
public class ejrcicioONCE {
	
		
	
		   
		    static boolean esPrimo(int numero) {
		        if (numero <= 1) {
		            return false;
		        }
		       
		        for (int i = 2; i <= Math.sqrt(numero); i++) {
		            if (numero % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		    public static void main(String[] args) {
		       
		        int tabla[] = {3, 6, 2, 77, 3, 10, 23, 14};
		        int contadorPrimos = 0;
		        for (int i = 0; i < tabla.length; i++) {
		            if (esPrimo(tabla[i])) {
		                contadorPrimos++;
		            }
		        }
		        System.out.println("Cantidad de números primos en la tabla : " + contadorPrimos);
		    }
		}
	

