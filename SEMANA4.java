
public class SEMANA4 {

	public static void main(String[] args) {
		//ASIGNAMOS ALA MATRIZ 
		int [][] matriz=new int[4][5];

		
		
	 for(int i=0;i<4;i++) {
		 for(int j=0;j<5;j++) {
		 if(i==j) {
			matriz[i][j]=1;
		 }else {
			matriz[i][j]=0;
		 }
		 System.out.print("["+matriz[i][j]+"]");	 
		 }
		 
		 System.out.println();
		
	 }
		
		
		

	}

}
