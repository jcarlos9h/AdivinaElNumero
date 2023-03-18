// CREAMOS UN PROGRAMA QUE GENERE UN NUMERO ALEATORIO Y QUE EL USUARIO ADIVINE

import java.util.*; // importamos el paquete java util para usar  la clase scanner para que el programa permita ingresar datos
public class Bucles2_adivina_elnumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generamos un numero aleatorio con el metodo math
	//	System.out.println(Math.random()*100); // multp. por 100 para correr la , dos espacios y obtener un numero doble entero
		
		// hacemos una refundicion para que convertir el numero double en entero
		
		// creamos una variable y hacemos la refundicion
		
		int aleatorio=(int)(Math.random()*100);
		
	//	System.out.println(aleatorio); // le decimos a system que imprima el valor de la var aleatorio
		
		// le pedimos al usuario que ingrese un valor, usando el metodo scanner
		
		Scanner userNumber=new Scanner (System.in); 
		
		int numero=0;
		int intentos=0;
		
		// creamos el bucle while
		
		while (numero !=aleatorio) { // si numero es diferente de aleatorio inicia el bucle while 
			                         //numero=0 aleatorio = num aut del programa
			intentos++;
			System.out.println("Introduce un numero "); // pedimos al usuario que introdusca un numero
			numero=userNumber.nextInt(); // con la clase scanner guardamos ese numero en la var numero.
			
			if (aleatorio< numero) { //utilizamos el condicional if
				
				System.out.println("Es mas bajo");
			}
			
			else if (aleatorio>numero) {
				
				System.out.println("ES mas alto");
				
			}
			
		}

		System.out.println("Adivinaste el numero era " + numero + " Lo hiciste en " + intentos + " intentos");
	}

}
