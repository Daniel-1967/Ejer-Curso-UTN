package Clase1;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float ingresos = 500000; 
		int autos = 2; 
		boolean antiguedad = true;     
		int inmuebles = 2; 
		boolean lujo = false; 
		
		if ( (ingresos >= 489083  ) || ( (autos > 2 ) && ( antiguedad == true ) ) || ( inmuebles > 2  ) || ( lujo == true )       ) 
		{
			System.out.println("Es segmento alto") ;
		}
		else 
		{
			System.out.println("No es segmento alto");
		}

		
		
		
	}

}
