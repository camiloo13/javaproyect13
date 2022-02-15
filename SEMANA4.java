
public class SEMANA4 {

	public static void main(String[] args) {
		//ASIGNAMOS ALA MATRIZ 
		int [][] matriz=new int[4][4];
		//Ponemos valores a la matriz
		
		matriz[0][0]=2;
		matriz[0][1]=3;
		matriz[0][2]=5;
		matriz[0][3]=10;
	
		
		matriz[1][0]=2;
		matriz[1][1]=2;
		matriz[1][2]=2;
		matriz[1][3]=2;

		
		
		matriz[2][0]=40;
		matriz[2][1]=34;
		matriz[2][2]=20;
		matriz[2][3]=60;

		
		
		matriz[3][0]=67;
		matriz[3][1]=35;
		matriz[3][2]=2;
		matriz[3][3]=2;
	
		

		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println();
		}
		
	 
		
		
		

	}

}
