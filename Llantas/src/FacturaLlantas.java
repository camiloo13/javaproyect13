import java.util.Scanner;
public class FacturaLlantas {

	public static void main(String[] args) {
		
		
		int numllantas;
		
		
	   
	
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Bienvenido al montallantas Ponchadas \n ");
		System.out.println("Las  promociones hay en nuestro inventario digite ");
		

	System.out.println("LAS OFERTA QUE TENEMOS DISPONIBLES SON\n "
					+ "Si compras menos de 5 llantas el precio de cada llanta es de 30.000\n "
					+"Si compras entre 5 a 10 llantas la unidad es a 25.000 \n "
					+"Si compras mas de 10 es a 20.000");
		
		
		
	System.out.println("DIGITE EL Numero de LLantas a comrpar");
	numllantas=teclado.nextInt();
	
	System.out.println(" EL Numero de LLantas a comrpar es "+numllantas);
	
    
      
	 
	 	
	if(numllantas==1 || numllantas==2 || numllantas==3|| numllantas==4) {
	 int prec1=   numllantas*30000;	
	System.out.println("El valor de la factura"+prec1);
	}
	
	else if(numllantas== 5||numllantas== 6||numllantas== 7||numllantas==8 ||numllantas==9 ||numllantas==10) {
	int prec2=   numllantas*25000;
	System.out.println("El valor de la factura"+prec2);

	}
	else if (numllantas >10) {
		int prec3= numllantas*20000;
		System.out.println("El valor de la factura:"+prec3);
	}
	else {
		System.out.println("error");
		teclado.close();
	}
	
	
	
		int totaldes;
	    int des= 0;
	System.out.println("Si su compra fueron 2 y 4 llantas ingrese el total de su compra para el 20%Descuento");
	
	totaldes=teclado.nextInt();
	    
	   des= (int) (totaldes*0.2);
		
		System.out.println(" Su descuento fue de"+des+"%");
		
		
		
		
		
		
		}
	
		
		
	}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


