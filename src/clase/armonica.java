package clase;

public class armonica {

	public static void main(String[] args) {
		System.out.println(armonica(2,3));

	}
	public static double armonica(double num1, double num2) {
		double suma =0;

	        suma = suma + 1/num1;
	        suma = suma + 1/num2;
	        return 2/suma;
	    }     	
	}



