package clase;

public class Metodos {

	public static void main(String[] args) {
		
System.out.println(ecuacionGrado2(27,56,16));
	}
	public static double suma(double num1, double num2) {
		return num1 + num2;
	
	}
	   public static double resta(double num1, double num2) {
		   return num1 - num2;
	   }
	   public static double multiplicacion(double num1, double num2) {
		   return num1* num2;
		   
	   }
	   public static double division(double num1, double num2) {
		   return num1/ num2;
	   }
	   public static double modulo(double num1, double num2) {
		   return num1%num2;
	   }
	   public static double raizCuadrada(double num1) {
		   return Math.sqrt(num1);
	   }
	   public static double potencia(double base, double exponente) {
		   return Math.pow(base, exponente);
	   }
	   public static double ecuacionGrado2(int a, int b, int c) {
		   return  (division(suma(-b,raizCuadrada((potencia(b,2))-(multiplicacion(multiplicacion(4,a),c)))),(multiplicacion(2,a))));
	   }


}
