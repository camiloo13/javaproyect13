
public class Principalcola {

	public static void main(String[] args) {
	 Pila ce=new Pila();

	 ce.inicializarCola(10);
	 Pais p=new Pais();
	 p.nombre="Colombia";
	 ce.push(p);
	 ce.imprimir();
	 Pais p2=new Pais();
	 p2.nombre="Rusia";
	 ce.push(p2);
	 ce.imprimir();
	 Pais p3=new Pais();
	 p3.nombre="Ucrania";
	 ce.push(p3);
	 ce.imprimir();
	 ce.pop();
	 System.out.println();
	ce.imprimir();
	 
	}

}

