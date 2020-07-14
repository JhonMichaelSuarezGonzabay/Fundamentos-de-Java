
public class MayorArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int [] {
				1, -3, 6, 8, -9, 19, -20, 0, 17, 200
		};
		
		int num =numeros[0] ;
		int posicion = 0;
		
		for(int i=0; i < numeros.length; i++ ) {
			if (num < numeros[i]) {
				num = numeros[i];
				posicion = i;
				
				
			}
		}
		System.out.println(num);
		System.out.println("La posicion del numero mayor es: " + posicion );
	}

}
