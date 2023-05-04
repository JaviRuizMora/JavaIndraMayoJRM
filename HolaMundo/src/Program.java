
public class Program {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		//Tipos De Datos Primitivos
		int numero = 20;
		System.out.println(numero);
		
		double medio = 0.5;
		System.out.println(medio);
		
		boolean verdadero = true;
		System.out.println(verdadero);
		
		
		//Tipos de datos Objetos (hay que pedir memoria con new)
		String nombre = "Javier"; //Como es tan común se omite new
		//String nombre = new String("Hola");
		System.out.println(nombre);
		
		@SuppressWarnings("removal")
		Integer num = new Integer(2);
		System.out.println(num);
		
		//Conversión de tipos
		//numero = medio; No compila, asignación inválida (Type missmatch)
		
		medio = numero; //Conversión implícita
		
		String enLetras = Integer.toString(numero); //Conversión explícita (especie casteo)
		System.out.println("El número en letras es " + enLetras);
		System.out.printf("El número en letras es %s", enLetras);
		System.out.println();
		System.out.printf("El número en letras es %d", numero);
		System.out.println();
		
		enLetras = "22";
		numero = Integer.parseInt(enLetras); //Conversión explícita de string a int
		System.out.println(enLetras);
		
		//Captura de excepciones
		try {
			enLetras = "22dos";
			numero = Integer.parseInt(enLetras);
		} catch (NumberFormatException ex) {
			System.out.println("No se pudo convertir de " + enLetras + " a int");
		} catch (Exception ex) {
			System.out.println("Ocurrió un error inesperado");
		}
		
		//Convierto un string con un numero decimal en una variable float
		String medioString = "0.5";
		float medio2 = Float.parseFloat(medioString);
		System.out.println(medio2);
	}

}
