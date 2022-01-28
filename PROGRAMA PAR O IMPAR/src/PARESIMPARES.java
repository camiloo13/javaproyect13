import java.util.Scanner;

import javax.swing.JOptionPane;


public class PARESIMPARES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner  teclado =new Scanner(System.in);
		
		int numero;
		String text;
		
		text=JOptionPane.showInputDialog(" BIENVENIDO , AQUI PODRAS PREGUNTAR SI UN NUMERO ES PAR O IMPAR 64 \n INGRESE UN NUMERO ENTERO");
		numero = Integer.parseInt(text);
		 
		
		
		
		
		
		 if(numero % 2==0) {
			 
			 JOptionPane.showMessageDialog(null,"Su Numero es Par :D");
			 
		 }else {
			 
			 JOptionPane.showMessageDialog(null,"Su Numero es Impar :D");
		 }
			 
		
		
	}

}
