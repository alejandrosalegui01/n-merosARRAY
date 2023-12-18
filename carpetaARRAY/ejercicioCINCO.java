
public class ejercicioCINCO {
	
		
		public class Ejercicioarraynumeros {
		   
		    static int factorial(int x){
		        int fact = 1;
		        for(int i = 2;i <= x;i++)
		            fact = fact * i;
		        return fact;
		    }
		    public static void main(String[] args) {
		        int tabla[] = new int[10];
		       
		        for(int i=0;i<tabla.length;i++)
		            tabla[i] = factorial(i);
		       
		        for(int i=0;i<tabla.length;i++)
		            System.out.print(" " + tabla[i]);
		}
		}
	

	}

