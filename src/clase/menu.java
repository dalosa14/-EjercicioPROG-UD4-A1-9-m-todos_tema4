package clase;

import java.util.Scanner;

public class menu {
	static boolean salir = false;
	public static void main(String[] args) {
		showMenu();
	}
    private static int displayMenu(){
    	System.out.println("elige una opción");
		System.out.println("1) Opción 1");
		System.out.println("2) Opción 2");
		System.out.println("3) Opción 3");
		System.out.println("4) Salir");
		Scanner rOpcion = new Scanner(System.in);
		int opcion = rOpcion.nextInt();
		return opcion;
    }
    private static void manageSelectedOption(int selectedOption){
    	switch(selectedOption) {
    	case 1:
    		System.out.println("has seleccionado la opción 1 ");
    		break;
    		
    	case 2:
    		System.out.println("has seleccionado la opción 2");
    		break;
    	case 3:
    		System.out.println("has seleccionado la opción 3");
    		break;
    	case 4:
    		menu.salir = true;
    		break;
    		default:
    			System.out.println("Solo numeros del 1 al 4 son aceptados");
    			
    	}
    }
    public static void showMenu() {
    	
    	while(!menu.salir) {
    		int selectedOption = displayMenu();
            manageSelectedOption(selectedOption);
    	}
    	
  }
}
