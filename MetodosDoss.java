import java.util.Scanner;
public class MetodosDoss {

		// TODO Auto-generated method stub
	private static Scanner uwu=new Scanner(System.in);
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenid@ al programa Métodos realizado por Paula Andrea Buitrago Rivera");
		byte opcion=mostrarMenuYObtenerOpcion();
		double valor=obtenerDouble();
		System.out.println("El valor digitados es "+valor);
		double resultado=0;
		switch (opcion) {
		case 1:
			resultado=convertirGradosARadianes(valor);
			break;//exit
		case 2:
			resultado=convertirRadianesAGrados(valor);
			break;//exit
			default:
				System.out.println("Error");
				System.exit(0);
		}
		System.out.println("El resultado es "+resultado);
		System.out.println("Gracias por usar el programa");
		uwu.close();
	}
	/**
	 * 
	 * @return
	 */
private static byte mostrarMenuYObtenerOpcion() {
	System.out.println("Elija una opción:");
	System.out.println("1.Convertir grados a radianes");
	System.out.println("2.Convertir radianes a grados");
	byte salida=0;
	if(uwu.hasNextByte()) {
		salida=uwu.nextByte();
	}else {
			System.out.println("Error en el número digitado");
			System.exit(0);
		}
		return salida;
	}
    /**
     * 
     * @return
     */
	private static double obtenerDouble() {
		System.out.println("Por favor digite el valor real");
		double salida;
		if(uwu.hasNextDouble()) {
			salida=uwu.nextDouble();
		}else {
			System.out.println("Error en el número digitado usa (,) no (.)");
			salida=Double.NaN;
		}
		return salida;
	}
	/**
	 * 
	 * @param grados
	 * @return
	 */
	private static double convertirGradosARadianes (double grados) {
		double radianes=(grados*Math.PI)/180;
		return radianes;
	}
	/**
	 * 
	 * @param radianes
	 * @return
	 */
	private static double convertirRadianesAGrados (double radianes) {
		double grados=(radianes*180)/Math.PI;
		return grados;
	}
}