
public class ejercicioOCHO {


	
		public static void main(String[] args) {
			int tabla[] = {1,4};
			boolean capicua = true;
			
			for(int i=0;i<tabla.length;i++) {
				
		      if(tabla[i] != tabla[tabla.length -1-i])
		    	  capicua= false;
			}
			if (capicua)
				System.out.println("SI");
			else
				System.out.println("NO");
			
		}		
	}

