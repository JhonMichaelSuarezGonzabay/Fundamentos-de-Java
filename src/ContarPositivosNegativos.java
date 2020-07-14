

public class ContarPositivosNegativos {
	// Almacenar 10 numeros en un arreglo
	// Iprmir cuantos son ceros, cuantos son negativos, cuantos positivos
	// imprmir ademas la suma de los negativos
	// la suma de los positivos
	public static void main(String[] args) {
		
		int[] numeros = new int [] {
				1, -3, 6, 8, -9, 19, -20, 0, 17, 200
		};
		
		System.out.println(numeros.length);
		int ceros = 0, positivos = 0, negativo = 0;
		int sumaPositivos = 0, sumaNegativa = 0;
		
		for (int i=0; i<numeros.length;i++) {
			if(numeros[i]==0)
				ceros++;
			else if(numeros[i]>0) {
				positivos++;
			sumaPositivos += numeros[i];
			} else {
				negativo++;	
				sumaNegativa += numeros[i];
		}
	}
		System.out.println(ceros);		
		System.out.println(positivos);
		System.out.println(negativo);
		System.out.println("Postivos: " + sumaPositivos);
		System.out.println("Negativos: " + sumaNegativa);
	}

}