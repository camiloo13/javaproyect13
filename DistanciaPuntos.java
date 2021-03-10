import java.awt.Point;
import java.util.Scanner;
public class DistanciaPuntos {
    private static Scanner teclado=new Scanner(System.in);
    public static void main(String[] args) {
                darSaludo();
    	        Point puntoA,puntoB;

    	        puntoA=recibirPunto("digite el punto uno");

    	        puntoB=recibirPunto("digite el punto dos");

    	        double distancia=calcularDistancia(puntoA, puntoB);

    	        cajaTexto(String.format("Distancia %.2f",distancia));

    	 despedirse();        

    	        

    	    }

private static void cajaTexto(String format) {
	   System.out.println(format);
   }
private static double calcularDistancia(Point puntoA, Point puntoB) {
		double distancia=Math.sqrt(Math.pow(puntoA.x-puntoB.x,2)+Math.pow(puntoA.y-puntoB.y,2));
		return distancia;
	}

private static void despedirse() {
	
	System.out.println("GRACIAS ADIOS");
					
	
	}













private static Point recibirPunto(String string) {
    	   int x1=0 ,y1=0;
	   System.out.println("DIGITE PUNTO");
		if(teclado.hasNextInt()) {
		 x1=teclado.nextInt();
		}else {
			System.out.println("error");
			System.exit(0);
		}
		System.out.println("DIGITE PUNTO");
		if(teclado.hasNextInt()) {
		 y1=teclado.nextInt();
		
		}else {
			System.out.println("ERROR");
			System.exit(0);
		}
		
		Point punto=new Point(x1,y1);
		return punto;
	}

  

	private static Point recibirPunto() {
		int x2=0, y2=0;
		System.out.println("SEGUNDO PUNTO");
		x2=teclado.nextInt();	
		System.out.println("SEGUNDO PUNTO");
		y2=teclado.nextInt();
		Point segundo=new Point(x2,y2);
		return segundo;
	}
	private static void darSaludo() {
			 System.out.println("BIENVENIDO AL PROGRAMA DE CALCULAR DISTANICAS ");		
			 teclado.close();
			 
	}

}