package clase;

public class ejer2 {

	public static void main(String[] args) {
		System.out.println(factorial(6));
	}
	public static int factorial(int numero) {
		
		int factorial = 1;


		while(numero > 0) {
		factorial = factorial*numero;
		numero--;
		}
		return(factorial);

}

}

