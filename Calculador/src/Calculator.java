import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		

				
				int a=0;
				int b=0;
				int res=0;
				
				String operacion;
		  Scanner teclado=new Scanner(System.in);
		  
		  
		  System.out.println("DIGITE UN NUMERO A");
		  if(teclado.hasNextInt()) {
			   a=teclado.nextInt();
		  }else {
			  System.out.println("error");
			  System.exit(0);
		  }
		 
		  System.out.println("DIGITE NUMERO B");
		  
		  if(teclado.hasNextInt()) {
			    b=teclado.nextInt();
		  
			  
			  
		  }else  {
			  System.out.println("error");
			  System.exit(0);
		  }
		
		   
		  System.out.println("DIGITE LA OPCION QUE VA COVERITR \n ");
		 
		  

		  System.out.println("+: Suma"
				  +"\n-: Resto"
				  +"\n*:Multiplicaicon"
				  +"\n/: Division"
				  +"\n%:Porcentaje"
				  +"\n^:Potencia");	
		operacion=teclado.next();
		operacion=teclado.next();
		
		
		
		
		  
		  switch(operacion) {
		  case "+":
			  res=a+b;
			  System.out.println("Usted elegio la suma\n El resultado de la suma es  "
			  +res);
			  break;
		  case"-":
			  res=a-b;
			  System.out.println("Usted elegio resta\n      El resultado de la resta es "+res);
			  break;
		  case"*":
			  res=a*b;
			  System.out.println("Usted elegio multiplicacion\n      El resultado de la multiplicacion es "+res);
			  break;
		  case "/":
			  if  (b==0) {
					System.out.println ("error");
					System.exit(0);
			  }else {
				   res=a/b;
				   System.out.println("Usted elegio divicion\n      El resultado de la divicion es "+res);
			  }
			    	  
			   
			   break;
			 
			  
		
			  
			
		  
			  
		  case "%":
			  if  (b==0) {
					System.out.println ("error");
					System.exit(0);
			  }else {
				  res=a % b;
				    System.out.println("Usted elegio porcentaje\n    El resultado del porcnetaje es  " +res);
		 
			  }
			  
			
			 break;
			  
		  case "^":
			  System.out.println("Usted ingreso potencia");
			  System.out.println("LA POTENCIA ES "+Math.pow(a, b));
				  
			  }
		
		  }
		  
		  
}
			
			
			
			
			
			

		

			
			
			
			
			



	