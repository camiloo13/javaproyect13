import java.util.Scanner;

public class juegofutbol {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		

		
		System.out.println("Digite  del equipo uno ");
		String equipo1=teclado.nextLine();
		System.out.println("Digite el equpio dos");
		String equipo2=teclado.nextLine();
		int puntajeuno=0 , puntajedos=0;
		int partido=1;
		while (partido<=8) {
			int golUno=(int)(Math.random()*5);
			int golDos=(int)(Math.random()*5);
			if(golUno>golDos) {
				puntajeuno+=3;
			}else if(golDos>golUno) {
				puntajedos+=3;
				
			}else if(golUno>0 && golUno==golDos) {
				puntajeuno++;
				puntajedos++;
			}else {
				System.out.println("PARTIDO INVALIDO");
				continue;
			}
			partido++;
			System.out.println("RESULTADOS DELPARTIDO"+partido);
			System.out.println(equipo1+"<"+golUno+"-"+golDos+">"+equipo2+"");
			if(puntajeuno>=15 || puntajedos>=15) {
				break;
			}

		}
					partido--;
					System.out.println("Se jugaron"+partido+"partidos");
					System.out.println("el"+equipo1+"Consigui "+puntajeuno);
					System.out.println("el"+equipo2+"Consigui "+puntajedos);
					if(puntajeuno>puntajedos) {
						System.out.println("Felicidades gano tu equipo");
						
					}else {
						System.out.println("Euipo perdio puto");
					}
	}

}
