
public class CrearClase {

	public static void main(String[] args) {
		//Nombre de la clase
		//Se crea Vacio
		Persona Formulario=new Persona();
      Formulario.nombre="Camilo Barragan";
      Formulario.alture=1.80;
      Formulario.edad=40;
      Formulario.genero='M';
      Formulario.peso=20;
      
      System.out.println("Nombre es "+Formulario.nombre);
      System.out.println("Altura es "+Formulario.alture);
      System.out.println("Genero es "+Formulario.genero);
      System.out.println("Peso es "+Formulario.peso);
      if(Formulario.genero=='M') {
    	  System.out.println("MASCULINO");
    	  
      }else if(Formulario.genero=='F') {
    	  System.out.println("FEMENINO");
      }else {
    	  System.out.println("LGTB");
      }
      
	}

}
