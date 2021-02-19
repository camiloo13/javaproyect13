import java.util.Scanner;
public class IndiceMasaCorporal{ 
	public static void main(String[] args) {
		
		double masa=0;
		double estatura=0;
	    Scanner entrada=new Scanner(System.in);
	     
		 System.out.println("Bienvenido al medidor de Masa Corporal Camilo Barragan");  
		 
		  System.out.println("Digite la masa corporal en KG ");
		  masa=entrada.nextDouble();
		  System.out.format("Su masa  en KG es %.2f" ,masa);
		if(masa <= 0) {	
		 		  System.out.println("error");
		 		 System.exit(0);
		
		  
		  
		  }else if(masa > 0)
			  
         System.out.println("La masa corporal digitada en  "+masa+"kg" );
		
		
		//ESTATURA 
		
         System.out.println("Digite la  estatura  en CM ");
         estatura=entrada.nextDouble();
        System.out.format("Su estatura en metros es %.2f" ,estatura);
	    
         if (estatura <= 0) {
        	 System.out.println("error");
            System.exit(0);
            
           } else if(estatura > 0)
		 System.out.println("La estatura digita en cm fueron"+estatura+"cm");
         
         System.out.println("La Resgistrados en masa(kg)fueron" +masa+"kg");
        		
 	
         
 		
        
        double imc= masa/(estatura*estatura);
        System.out.println("El valor de su IMC ");
      
        System.out.format("%.2f  ", imc);
        if(imc < 16.00) {
        	System.out.println("Delgadez severa");
        }else if(imc>=16.00 && imc <18.50) {
        	System.out.println("Delgadez moderada o leve");
        }else if(imc>=18.50 && imc<25.00) {
        	System.out.println("Normal");
        }else if(imc>=25.00 && imc<30.00) {
        	System.out.println("Sobrepeso");
        }else if (imc>=30.00 && imc<40.00) {
        	System.out.println("Obesidad");
        
	}else {
	 System.out.println("Obesidad mórbida");
     entrada.close(   	
        	
        	
        	
        	
        	
        	);

        }
     
}
	
		 }
         
       	
         
	
	
	
      

	
			
		


