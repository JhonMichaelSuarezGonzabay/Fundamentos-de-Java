import java.util.Scanner;

public class Numero_Par_Impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;

		System.out.println("Leer numero: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		numero = in.nextInt();
		// sout

		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
		}

		// String result = "" + numero;
		// result = Integer.toString(numero);

	}

}
