
public class ejercicioCUATRO {
	
		public static void main(String[] args) {
			int tabla[]= {3,6,2,77,3,10,23,14};
			int pos = 0;
			int cambio = 0;
			int z = 0;
			
			for(int i=0;i<tabla.length;i++) {
				pos = tabla[i];
				cambio=i;
				for(int j=i+1;j<tabla.length;j++)
					if(pos < tabla[i])
						cambio=i;
			
				// Intercambiar tabla[0] y tabla[posmax]
				z=tabla[i];
				tabla[i]=tabla[cambio];
				tabla[cambio]=z;}
			
				//tabla[posmax]=tabla[0];
				//tabla[0]=max;
				System.out.println("i= " + z);
				for(int j=0;j<tabla.length-1;j++) {
					System.out.println(j + ": " + tabla[j]);}
		
			
			
		
	}
	}


