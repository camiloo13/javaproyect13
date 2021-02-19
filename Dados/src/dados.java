
import java.util.Scanner;
public class dados {

	public static void main(String[] args) {

		
		
		Scanner entrada=new  Scanner(System.in);
				
		System.out.println("Digite su  name");
		String jugador=entrada.next();
		
		System.out.println("Hola  "+   jugador);
		int dado1=(int) (Math.random()*6+1) ; int dado2=(int) (Math.random()*6+1);
		int suma=dado1+dado2;
		System.out.println("Los dados dieron    "+suma);
		if (suma== 7 || suma== 11) {
			System.out.println("Ganaste!"+jugador);

	}
		else if(suma== 2||suma== 3||suma== 12 ){
		System.out.println("PERDISTE "+jugador);
		
		} 
	
		
		else if(suma==4||suma==5 ||suma==6 ||suma==8 ||suma==9 ||suma==10){	
		System.out.println("putno para "+jugador+ "I");
	}
		else {
			System.out.println("error");
			entrada.close();
		}

}
}

	