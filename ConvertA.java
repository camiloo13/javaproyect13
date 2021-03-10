import java.util.Scanner;
public class ConvertA {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
	darBienvenida();
	byte opcion=mostrarMenuYObtenerOpcion();
	double valor=obtenerDouble();
	double resultado = 0;
	switch (opcion) {

	case 1:
	     resultado = convetirGradosARadianes(valor);
	     break;

	case 2:
	     resultado = convetirRadianesAGrados(valor);
	break;
	default: 
	     System.out.println("Error");
	     System.exit(0);

	}

	System.out.println("El resultado es "+resultado);
	System.out.println("Gracias por usar nuestro programa");
	teclado.close();
	}
	


private static byte mostrarMenuYObtenerOpcion() {
	System.out.println("eliga una opcion");
	System.out.println("1 Convertir grados a radianes");
	System.out.println("2 Converitr de radianes a grados ");
	byte salida=0;
	if(teclado.hasNextByte()) {
		salida=teclado.nextByte();
		}else {
			System.out.println("ERROR EN EL NUMERO DIGITADO");
			System.exit(0);
		}
	return salida;
}

private static double obtenerDouble() {
	System.out.println("DIGITE UN NUMERO REAL");
	double salida;
	if(teclado.hasNextDouble()) {
		salida=teclado.nextDouble();
				
	}else {
		System.out.println("Error en el número digitado usa (,) no (.)");
		salida=Double.NaN;
	}
	return salida;
}
private static double convetirGradosARadianes(double grados) {
	double radianes=(grados*Math.PI)/180;
		return radianes;
	}

private static double convetirRadianesAGrados(double radianes) {
	double grados=(radianes*180)/Math.PI;
		return   grados;
	}


		
	
	private static void darBienvenida() {
		System.out.println("BIENVENIDO ");
	
		}
	
	


}



















	


	
	