import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListaEnlazada {

	static Mascota cabeza;
	static Mascota fin;
	

	public void menu() {
		
		System.out.println("----- Bienvenido ------");
		System.out.println("1) Insertar Mascota");
		System.out.println("2) Buscar mascota");
		System.out.println("3) Imprimir lista de mascotas para adopcion");
		System.out.println("4 Eliminar Registro de Mascota");
		System.out.println("5)Entregar Mascota Adopcion");
		System.out.println("6) Salir");
	}
		public String leer() {
			
			try {
				BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			    return in.readLine();	
			}catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		
	}
	
	public void digitarOpcion() {
		
		int opcion=0;
		do {
			try {
				menu();
				opcion=Integer.parseInt(leer());
				
				switch(opcion) {
				case 1:
					crearLista();
					break;
				case 3:
					imprimirLista();
				case 6:
					System.out.println("Gracias x venir lol");
				     break;
				}
			}catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("DIGITE UNA OPCION NUMERICA");
				
				
				}
			}while(opcion !=6);
		}
	
	
	
	
	public Mascota  pedirDatos() {
		
		 Mascota temporal=new Mascota();
		 System.out.println("Digite la raza de la mascota");
		 temporal.raza=leer();
		 System.out.println("Digite Peso de la Mascota");
		 temporal.peso=Float.parseFloat(leer());
		 System.out.println("Digite colo Mascota");
		 temporal.color=leer();
		 System.out.println("DIGITE altura");
		 temporal.altura=Float.parseFloat(leer());
		 System.out.println("Digite Tamaño de la mascota");
		 temporal.tam=leer().charAt(0);
		 temporal.siguiente=null;
         return temporal;
	}
	
	
	public void crearLista() {
		
		if(cabeza==null) { //No tiene elementos 
			cabeza=new Mascota();
			cabeza=pedirDatos();
			fin=cabeza;
			
		}else {                       //SI HAY ELEMNEOTS EN LA LISTA
	
		Mascota auxiliar=new Mascota();
		auxiliar=pedirDatos();
		fin.siguiente=auxiliar;
		fin=auxiliar;
		
		}
		
		
		
	}
	
	public void imprimirLista() {
		
		if(cabeza!=null) {
			
			 Mascota aux=cabeza;
			 while(aux!=null)
			 {
				 System.out.println("RAZA:"+aux.raza);
				 System.out.println("Nombre"+aux.color);
				 System.out.println("Color"+aux.peso);
				 System.out.println("Altura:"+aux.altura);
				 System.out.println("Tamanio"+ aux.tam);
				 aux=aux.siguiente;
			 }
		}else {
			System.out.println("No hay elementos");
		}
		
	}
	
	
	
	
	
	public void inicializar() {
		digitarOpcion();
		
		
	}
	
	
	public static void main(String[] arg) {
		ListaEnlazada les=new ListaEnlazada();
		les.inicializar();
		
	}
	
	
	
}


