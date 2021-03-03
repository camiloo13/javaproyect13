import java.util.Scanner;
public class VidaCredito {

	public static void main(String[] args) {
		//VARIABLES
		String nombre;
		
		double prestamo=0;
		double salario=0;
		double patrimonio=0;
		
		Scanner teclado=new Scanner(System.in);
	    System.out.println("DIGITE SU NOMBRE");
	    if(teclado.hasNextDouble ()){
	    	System.out.println("ERROR");
	    	System.out.println("Deben ser solo letras");
	    	System.exit(0);
	    }else {
		
		 nombre=teclado.nextLine();
		System.out.println("Bienvenido  "+nombre+"  AL PROGRAMA  DE VIDA CREDITICA ");
		System.out.println("Ha continuacion le pediremos digitar una informacion ");
		 
		 
		
	      
         
        System.out.println("HISTORIA CREDITICA (b)buena m(mala");
         
        if(teclado.hasNextDouble()) {
        	 System.out.println("ERROR ");
        	 System.out.println("DEBEN SER LETRAS");
        	 System.exit(0);
         }else {
         String  historia = teclado.nextLine();
         
         }
         
   		 
   			
         
     System.out.println("Digite el valor del prestamo");
         prestamo=  teclado.nextDouble();
         System.out.format("Su prestamo es de %.2f",prestamo,"pesos");
         
         System.out.println( "\n Digite su salario ANUAL ");
         
         if(teclado.hasNextDouble ()){
        salario=teclado.nextDouble();
 	    }else {
 		
        System.out.println("ERROR");
 	    System.out.println("Deben ser solo numeros");
        System.exit(0);	
 		
 	    }
       
        
         System.out.println("\nDigite su patrimonio ");
         
         if(teclado.hasNextDouble()) {
        	  patrimonio=teclado.nextDouble();
        	   System.out.format("\nSu patrimonio es de %.2f",patrimonio);
         }else {
        	 

             System.out.println("ERROR");
      	    System.out.println("Deben ser solo numeros");
             System.exit(0);	
        
         }
         
         if(salario>=( prestamo *50)/100 && patrimonio>= 2*prestamo)  {
 			System.out.println("Puntos obtenidos 10, \nSu petición ha sido aceptada");	
 	
 		} else if (salario>=prestamo*25/100 || salario<prestamo *50/100 && patrimonio>= 2*prestamo ){
 			System.out.println("Puntos obtenidos 8, \nSu petición ha sido aceptada");
 		
 		} else if (salario>=prestamo*25/100 || salario<prestamo *50/100 && patrimonio<2*prestamo ){
 			System.out.println("Puntos obtenidos 6,\n su petición ha sido negada");
 	
 		
 		} else if (salario>=( prestamo *50)/100 && patrimonio<2*prestamo)  {
 			System.out.println("Puntos obtenidos 8, \nSu petición ha sido aceptada");		
 		
 		} else if (salario>=prestamo*10/100 || salario<prestamo *25/100 && patrimonio<2*prestamo ){
 			System.out.println("Puntos obtenidos 4, \nSu petición ha sido negada");
 		
 		} else if (salario>=prestamo*10/100 || salario<prestamo *25/100 && patrimonio>= 2*prestamo ){
 			System.out.println("Puntos obtenidos 6, \nSu petición ha sido negada");
 			
		
 				
 			
 			
 		
 		
 		
 			
         }
	    }
	}




}

	



