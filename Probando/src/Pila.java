
public class Pila {



		Pais [] cola;// pila que guarda enteros
		int tamanio;//Tamaño maximo de la pila 
		int Indicecola = 0;// cuantos elementos se van guardando en la pila 
		
		/* tiene dos operaciones pop y push
		operacion push es guardar
		operacion pop para sacar 
		*/
		
		//PUSH ==
		public void push(Pais pais) {
			//CANTIDAD DE DATOS - CAPACIDAS TOTAL 
			if(Indicecola<tamanio) {
				//En el arreglo cola [Indice Cola ]=pais
				cola[Indicecola]=pais;
				Indicecola++;
				System.out.println("Push" +pais.nombre);
				}else {
					System.out.println("El Pais no puede ser guardado cola llena");
				}
			
		}
		
	
		public Pais pop() {
			   if(Indicecola>0) {
				   
				   Pais pais_temportal=cola[0];
				   //Mueve una Posicion
				   for(int i=0;i<Indicecola;i++) {
					   cola[i]=cola[i+1];
				   }
				   
				   cola[Indicecola]=null;
				   Indicecola--;//indice Cola = indiceCola -1
				   return pais_temportal;
				   
			   }else {
				   System.out.println("No hay elementos en la cola");
				   return null;
			   }
				
			}
			
			
		
		
		
		
		
		
			
		public void imprimir() {
			
			for(int i=0; i <Indicecola; i++) {
				Pais p=cola[i];
				System.out.println(p.nombre);
			}
			
			
		}
			
			
		
		
		
		
	
			
			
			

		

		
		
		
		//operaciones necesarias para el funcionamiento de la pila 
		public void inicializarCola (int n) {//n = es la cantidad maxima que va a tener la pila 
		
			cola=new Pais[n];
			tamanio=n;
			Indicecola=0;
		}
		
		
		
		
	}
	
	

