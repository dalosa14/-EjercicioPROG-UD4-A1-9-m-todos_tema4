package clase;

import java.util.Scanner;

public class saludo {

	public static void main(String[] args) {
		


		System.out.println("elige un idioma");
		System.out.println("a) Valenciano");
		System.out.println("b) Castellano");
		System.out.println("c) Inglés");
		Scanner rIdioma = new Scanner(System.in);
		String idioma = rIdioma.next();
		if(idioma.contentEquals("a") || idioma.contentEquals("b") || idioma.contentEquals("c")) {
			System.out.println("Escribe tu nombre");
			Scanner rNombre = new Scanner(System.in);
			String nombre = rNombre.next();
			saludo(nombre,idioma);
		}else {
			System.out.println("No has introducido un idioma correcto");
			return;
		}
		
	}
	public static void saludo(String nombre,String idioma) {
		switch(idioma) {
		case "a":
			System.out.println("Benvingut "+ nombre);
			break;
		case "b":
			System.out.println("Bienvenido "+ nombre);
			break;
		case "c":
			System.out.println("Welcome "+ nombre);
			break;
		}
		

	}

}
