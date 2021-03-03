import java.util.Scanner;

public class StringProyect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		String palabra; 
		
	    int numVocales=0;
	    String palabrainvertida="";
	    char [] palindromo;
	    int izq, der;
	    int numeros=0;
	    
	    
		System.out.println("USO DE ESTRING");
		System.out.println("DIGITE UNA PALABRA");
		palabra=teclado.nextLine();
		System.out.println(palabra.toUpperCase());
		System.out.println("Su palabra tiene "+palabra.length()+"  letras");
		 for (int i = 0; i < palabra.length(); i++) {
		      char c = palabra.charAt(i);
		      if ((c == 'A')  || (c == 'E') || (c == 'I') 
		      || (c == 'O')  || (c == 'U')) 
		        numVocales++;
		    }
	
	
		  System.out.println("Tienes "+numVocales+" Vocales");  
		 
		  for (int i = 0; i < palabra.length()-1; i++) {
		  
          if((palabra.charAt(i)== '1'||palabra.charAt(i)== '2'||palabra.charAt(i)== '3'||palabra.charAt(i)== '4'||palabra.charAt(i)== '5'||palabra.charAt(i)== '6'||palabra.charAt(i)== '7'||palabra.charAt(i)== '8'||palabra.charAt(i)== '9'))
		  numeros++;
		  
		  }
	     System.out.println("La palabra"+palabra+"Tiene   "+numeros);
	     
		  
		 
		 for (int i = palabra.length()-1; i>=0; i--){
	            palabrainvertida += palabra.charAt(i);
	        }
	 
	        System.out.println("La palabra invertida es:\n"+ palabrainvertida);
	        
	    palindromo = palabra.toCharArray();
		  izq = 0;
	        der = palindromo.length -1;
	        while(izq<der) {
	        	if(palindromo[izq] == palindromo[der]) {
	        		der --;
	        		izq ++;
	        		System.out.println("TRUE");
	        		
	        	}else {
	        		System.out.println("FALSE");
	        		break;
	        	}
	        
	        
	    }
		
		
	       
	      
	}
}


		



