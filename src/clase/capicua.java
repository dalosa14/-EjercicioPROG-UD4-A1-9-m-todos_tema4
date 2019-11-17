package clase;

public class capicua {

	public static void main(String[] args) {
		System.out.println(numeroCapicua(1421));
	}
	
	
	public static boolean numeroCapicua(int numero) {	
		int faltante;
		int numeroInvertido;
		int restante;
		
		
		faltante=numero;
		numeroInvertido=0;
		restante=0;
		
		while(faltante!=0) {
       
	    restante=faltante%10;
        numeroInvertido=numeroInvertido*10+restante;
        faltante=faltante/10;
		
		}
		
	    if(numeroInvertido==numero){
			
        return true;
        
		}else{
       
	        return false;
		
		}
		
		}

}
