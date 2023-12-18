
public class ejercicioTRES {
	public static void main(String[] args) {
	
		int tabla [] =  { 3,6,2,77,3,10,23,14,45,78};
	
		boolean repetido = false;
		
		
		for (int i=0 ; i <tabla.length;i++)
			for(int j = i+1;j<tabla.length;j++)
			  if (tabla[j] == tabla[i])
				repetido = true;
				
			
		
			if (repetido==true)	
				System.out.println("No son todos los arrays diferentes");
			else
				System.out.println("Todos los arrays diferentes");
		
	
		
		
		
	}
}

