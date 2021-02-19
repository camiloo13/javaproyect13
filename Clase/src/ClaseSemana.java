
import java.util.Scanner;
public class ClaseSemana {

	public static void main(String[] args) {
		
		System.out.println("HOLA BIENVENIDO AL PROGRAMA PARA SABER QUE DIAS TIENES CLASES");
		
		Scanner teclado=new  Scanner(System.in);
		
		System.out.println("ESCRIBA  EL DIA DE LA SEMANA ");
	    String nombreDia=teclado.nextLine();
		
	
		switch(nombreDia.toLowerCase()){
		case "lunes": 
			case "martes": 
				case "miercoles": 
					case "jueves": 
						case "viernes":
			System.out.println("El  "+nombreDia+"    SI hay clase");
				break ;
				
		case "sabado": case"domingo":
			System.out.println(" EL DIA "+nombreDia+"   NO HAY CLASE ");
			break ;
			default:
				System.out.println("ERROR");
			
		}

	}

}
