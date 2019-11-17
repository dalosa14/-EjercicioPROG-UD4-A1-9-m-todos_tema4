package clase;

import java.util.Scanner;

public class Juego {
	static int marcadorM;
	static int marcadorJ;
	static int Repetir;
	public static void main(String[] args) {
		do {int numeroM = getComputerShoot();
		int numeroJ = getUserShoot();
		showShoot(numeroM,numeroJ);
		computeResult(numeroM,numeroJ);
		System.out.println("Quiere jugar otra vez? Si=1/No=0");
		 
		 Scanner input = new Scanner(System.in);
		 Juego.Repetir = input.nextInt();
		}while(Juego.Repetir == 1); 
		

	}
	
	private static void showScissors(){
		String tijeras = ("\n"+
				"*   \n"+                                             
				" (*/   \n"+                                          
				"  ##**,    \n"+                                      
				"    ##/*/    \n"+                                    
				"     ####*/     \n"+                                 
				"       #####*     \n"+                               
				"        *######/    \n"+                             
				"          #######(    \n"+                           
				"            ##%,.#(/     \n"+                        
				"              ######((      \n"+                     
				"                //%#(###((#%##%########*    \n"+     
				"                 ****####%%%###(%%%%%%%%%##     \n"+ 
				"                  *****##%%%%##%%        *%%#    \n"+
				"                  ,%%##(*%#&%%#%            %%#  \n"+
				"                  %%%%%%#/*%#&%%%            #%# \n"+
				"                 %%#####%%#//%#&%#%           %#( \n"+
				"                 %%#%%%%%&%%#//&&%%#%         %##\n"+
				"                *%#%.      #%%%#%&&&%##,     %#% \n"+
				"                .%%/         %%%#(   %%%%###%%%  \n"+
				"                 %#,           &%#      (%%%.    \n"+
				"                  %%            %%#,             \n"+
				"                   %%*           %#%             \n"+
				"                    %%%#        /%%(             \n"+
				"                      %%%%%%%%%#%%/              \n");

		System.out.println(tijeras);
		}
		/**
		* Mostra el dibuix corresponent al paper
		*/
		private static void showPaper() {
		String papel = ("\n"+
			      ",,................................\n"+        
			      " ,,................................ \n"+       
			      " ,.................................     \n"+   
			      " ..................................        \n"+
			      " ,.................................        \n"+
			      " ,.................................      \n"+
			      " ,.................................       \n"+
			      " ,.................................      \n"+
			      " ,,................................       \n"+
			      " ,.................................        \n"+
			      " ,.................................        \n"+
			      " ..................................        \n"+
			      " ..................................        \n"+
			      " ..................................        \n"+
			      " ............................... ..        \n"+
			      " ..................................       \n"+
			      " ..................................         \n"+
			      " ..................................          \n"+
			      " ..................................          \n"+
			      " ..................................        \n"+
			      " ..................................        \n"+
			      " ..................................        \n"+
			      " ..................................        \n"+
			      " ..................................   \n"
				);
		System.out.println(papel);
		}
		/**
		* Mostra el dibuix corresponent a la pedra
		*/
		private static void showStones() {
			String piedra = ("\n"+             
      "           *,**,*,**,   \n"+                     
      "       ***,*,,,,***/**,*        \n"+           
      "     ***//***,,*/*(****,***         \n"+       
      "   /***////*****/**,////*/////          \n"+   
      "   //*///////*////****/(///*/(/            \n"+
      "  ///(*/**/*/**/*/**/*//(///((//(          \n"+
      " /(/(#(///*/***/////*//(((((((#//*         \n"+
      " ,/((//////(/*////*(//(/#((/(//**//        \n"+
      " (((//*/(##/(/#(((/((#/#((///(////(/       \n"+
      "  .(/(//((##(((#((((#(##(#(#(////(((       \n"+
      "     /(//#((#((#(//(###((##(//(///         \n"+
      "      ((/(((((((((#%((#((((((#               \n"
                    
                    
		
		
					
					
					);
			System.out.println(piedra);
		}
		/**
		* Mostra el banner de haber guanyat
		*/
		public static void showWinnerBanner() {
		 String win = ("\n"+                                                                                              
           "                                                              /##%#     \n"+                
           "                                                       #/######(  *#      \n"+              
           "                                               /%/##((%#       #  ###     \n"+              
           "                                        %%##**##(          %####.  ##      \n"+             
           "                                *#%######.      (/%##      (#(###  (##     \n"+             
           "                         ######%(       ,(     #####(#%*    ##(##*  ##         \n"+         
           "                 ,((##%###          .%##%((    ,%##/#(,,*#/ .*#%#%  ,(%            \n"+     
           "          ######.##         #####,   ###*##     (*(*##%###########/  ##                \n"+ 
           "    .,((%/#,      (%###%(   #####(    ######     *.#####%/(#*######   ##                \n"+
           "    ##     ####   (*##(###  %##%##    #%####     /##/##  %#########(  ##,               \n"+
           "    #%   *#(#(##  .#######* *#####     %#####     #%###     #######%   ##               \n"+
           "    .##   %##(###  %(#(#%###*%#%/#     #%####     ###*((       ##      ##               \n"+
           "     ##.   /#(%,## %##% #%#####%#%      ##((##     ##(#/        /##%###%                \n"+
           "      ##    (####(####%  (##%##%(#      ######           */#*####(                      \n"+
           "      ##*    *##%######   %##%####       #/      *#(######                              \n"+
           "       ##     .,#*##%##    (#(##*#        ##%##*#,(                                     \n"+
           "       ,%(      ####(##           *#%##%###.                                            \n"+
           "        ##       ((#       #####%##(                                                    \n"+
           "        %##        ,#%//#(##                                                            \n"+
           "         #########*.(                                                                   \n"+
           "                   \n"
                      );      
		 System.out.println(win);
		}
		public static void showLooseBanner() {
			String lose = (  "\n"+                                                                                                       
"												.(%%###%#((####/####(#//#####     \n"+       
"					.*##########((#########/(#(##(###((#/.                 ##         \n"+   
"####%/#(##########((##%##/,                                      .**###   ((#           \n"+ 
"%/.                               .%% */%%        ###(/###((/    ,#%#(     *#           \n"+ 
"#(#   ,(#(#(###(/  #/####/     (%##/    #((##       (#%#%##*       *#      #(            \n"+
"##/    (#(#(#/##     /##      ##*#((    (#(%/##     ##/(####       ##      /#            \n"+
"(/#     ##((###(.    (#      #######    ##((##%#    /##(##/#       (#      (#            \n"+
"##      ########,   ##     ########    *(##%#(#    ####(###        (      ##/           \n"+
"(/       ###(#%(#* ##      ###(####     ###%#/#/   #(#(###/        (/     /##           \n"+
"##        ####(###/        ##(#####     (###%###   ,###(#%#        #%     (##           \n"+
"#(         #((###((,       ########     ######//    #######        ##     ,##           \n"+
"##(         ###(####        ###((##     ##*#(/#     #####/#        #(      ##           \n"+
"##(         #(((####        %#/##(#*    #######     ###*(###      *#       /#           \n"+
"#/#         ####*###          ###(##    #%###,       #%####### ####        ##           \n"+
".(#         ##%###/#            #####  ####              (#(#% (           ##.          \n"+
"##       ##(######(##                                                .    #%#          \n"+
"(#                                      .# #  .#  ###/### /###/(  */(##.  ###          \n"+
"#(                     /## ((#/      ##((   /##%    ####(     ##  *#####  /#(          \n"+
"##,   #####/#        (##(   /##(#   //(#      ##    ####((     .   ####    ##          \n"+
"(##    ##/###       #####   *#####  ########        ######  /#      ###    ##          \n"+
"%##    ####(#      ####*#    ####(# (#####(####(    ###(## ##%       (     ##          \n"+
",##    #%(#((      /#,###    ######   ###/####*/#   ####(#   #       /     ##          \n"+
"##    ####%#      ,###(#,   ###### /#    /(#####   ##*##%     #(   %%(#   #((         \n"+
"/#    /#####     # ####%#   ###/#  .(#      ###*   .#(###   .#(/  #####   ###         \n"+
"##     ##/%/    ##  (###(   ((##    ###/   ##/    /%###(# *#/*/#    (,    ##/         \n"+
"##     ##### /####    *##% ###      #                                     *##         \n"+
"##(                                         .,((###(####//####(###((####(##%#         \n"+
"###            *((####((######(##(#(#(#/(###**#(((#*                                  \n"+
"/###%/##%#(##%##/####/                                                                \n");
		System.out.println(lose);
		}

		 /**
		* Mostra el banner de empate
		 */
		public static void showDraw() {
			String draw = (  "\n"+ 
"			XWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWX \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMM                         ;KMMMMMN \n"+
"			NMMMMMM                         ;KMMMMMN \n"+
"			NMMMMMM                         ;KMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMM                         ;KMMMMMN \n"+
"			NMMMMMM                         ;KMMMMMN \n"+
"			NMMMMMM                         ;KMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN \n"+
"			KNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNK \n");
			System.out.println(draw);
			}
		 /**
		* Mostra el separador vs
		 */
		 public static void showVsSeparator() {
				String vs = (  "\n"+ 
"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM \n"+
"	MMMMNK00000000KNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM \n"+
"	MMMMXl.........oNMMMMMMMMMMMMMMMMWWWWWMMMMMMMMMMMM \n"+
"	MMMMMMXc        .kWMMMMMMM0,        cXMMMMMMMMMMMM \n"+
"	MMMMMMMXc        '0MMMMMKk;        lNMMMMMMMMMMMMM \n"+
"	MMMMMMMMXc        ;KMMMX:        .lNMMMMMMMMMMMMMM \n"+
"	MMMMMMMMMXl        :XMNl    ..',,ck0KNWMMMMMMMMMMM \n"+
"	MMMMMMMMMMNl        lXd. .';;,'... ...;lx0NMMMMMMM \n"+
"	MMMMMMMMMMMNo.      .,..cl;.             .xWMMMMMM \n"+
"	MMMMMMMMMMMMNo.       .c,      .;lllc:,.;OWMMMMMMM \n"+
"	MMMMMMMMMMMMMNd.      ,c.      ;KWMMMMWNNMMMMMMMMM \n"+
"	MMMMMMMMMMMMMMWd.     .c,       .;lxOXWMMMMMMMMMMM \n"+
"	MMMMMMMMMMMMMMMWd.     .cc;.         .:xXMMMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMWx.     'okOo;.         'kWMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMMWx.   .xNWMMWXOxl,      .OMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMMMWx. .xWMWWWMMMMMX;     .xMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMMMMWk;xXkdc,;clooc,      ;KMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMMMMMWNk;               .cKMMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMMMMMMMN0xol;'... ...,:d0WMMMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMNXK000KXWMMMMMMMMMMMMM \n"+
"	MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM \n");
									System.out.println(vs);
		 }
		 
		 /**
		* Dibuja en pantalla la imagen correspondiente a la tirada
		 * del jugador 1 y del jugador2
		 *
		* @param jugada1 indica el objeto a dibujar
		 * @param jugada2 indica el objeto a dibujar
		*/
		 public static void showShoot(int jugada1, int jugada2) {
			 if(jugada1 == 1) {
				 showStones();
			 }else if(jugada1 == 2) {
				 showPaper();
			 }else if(jugada1 == 3) {
				 showScissors();
			 }
			 showVsSeparator();
			 if(jugada2 == 1) {
				 showStones();
			 }else if(jugada2 == 2) {
				 showPaper();
			 }else if(jugada2 == 3) {
				 showScissors();
			 }
			 
			
		 }

		 /**
		 * Demana a l´usuari que inserte un número del 1 al 3 que
		 * representa la jugada que vol fer
		 **/ 
		 public static int getUserShoot() {
			
			 System.out.println("Escoja su jugada-> 1.Piedra 2.Papel 3.Tijera");
			 
			 Scanner input = new Scanner(System.in);
			 
			 
			 
			 return input.nextInt();
		 }
		 /**
		 * Torna un número aleatori que representa la jugada del ordinador
		2 Programación - 1er DAW
		UD4 – Utilización de objectos. Métodos
		 **/
		 public static int getComputerShoot() {
			 double aleatorio = (Math.random()*3);
			 int valor = 0;
			 if (aleatorio >= 0 && aleatorio < 1) {
				 valor = 1;
			 }else if (aleatorio >= 1 && aleatorio <= 2) {
				 valor = 2;
			 }else if (aleatorio >= 2 && aleatorio <= 3) {
				 valor = 3;
			 }
			 return valor;
	
		}{

		 }
		 /**
		 * Calcula i mostra el resultat de la tirada
		 *
		 * @param jugador1 jugada seleccionada por el computador
		 * @param jugador2 jugada seleccionada por el usuario
		 * @return 0,1,-1 para empate, victoria o derrota.
		 */
		 public static int computeResult(int jugador1, int jugador2) {
			 int valor = 0;
			 if(jugador1 == 1 && jugador2 == 1) {
				 valor = 0;		 
			 }else if(jugador1 == 2 && jugador2 == 2) {
				 valor = 0;		 
			 }else if(jugador1 == 3 && jugador2 == 3) {
				 valor = 0;		 
			 }else if(jugador1 == 1 && jugador2 == 2) {
				 valor = 1;		 
			 }else if(jugador1 == 1 && jugador2 == 3) {
				 valor = -1;		 
			 }else if(jugador1 == 2 && jugador2 == 1) {
				 valor = -1;		 
			 }else if(jugador1 == 2 && jugador2 == 3) {
				 valor = 1;		 
			 }else if(jugador1 == 3 && jugador2 == 1) {
				 valor = 1;		 
			 }else if(jugador1 == 3 && jugador2 == 2) {
				 valor = -1;		 
			 }
			 if(valor == 1) {
				 showWinnerBanner();
				 Juego.marcadorJ++; 
			 }else if(valor == -1) {
				 showLooseBanner();
				 Juego.marcadorM++; 
			 }else if (valor == 0) {
				 showDraw();
			 }
			 System.out.println("Marcador del jugador: " + Juego.marcadorJ );
			 System.out.println("Marcador de la m�quina: " + Juego.marcadorM );

			 return valor;

}
}


