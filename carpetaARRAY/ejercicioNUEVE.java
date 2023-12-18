
public class ejercicioNUEVE {
	
	static int aleatorio(){
		// Función para generar un número aleatorio entre 0 y 39
		int numAleatorio = (int)Math.floor(Math.random()* 40);
		return numAleatorio;
	}
	
	static boolean existeTabla(int x, int t[], int cantidad) {
		for(int i=0;i<cantidad;i++)
			if(t[i]==x)
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		int tabla[] = new int[8];
		
		for(int i=0;i<tabla.length;i++) {
			int candidato=aleatorio();
		
			while (existeTabla(candidato, tabla, i))
				candidato=aleatorio();
			
			tabla[i]=candidato;
		}
			
	
		for(int i=0;i<tabla.length;i++)
			System.out.print(" " + tabla[i]);
}
}


