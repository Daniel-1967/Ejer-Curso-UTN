package Clase1;

public class Ej2 {

	public static void main(String[] args) {
		
		int nroinicio = 5; 
		int nrofin = 14; 
		
		while (nroinicio<nrofin) { 
			
			if (nroinicio%2==0) {
			    System.out.println("El número es par");
				System.out.println(nroinicio) ;  }
				else {
				    System.out.println("El número es impar");
					System.out.println(nroinicio) ;
				}
			
			nroinicio ++; 
		}
	}
	
}
