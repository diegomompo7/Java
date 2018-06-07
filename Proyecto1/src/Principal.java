import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tipos de variables más conocidas
		int opcion = 0;
		int contador = 0;
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		
		Scanner teclado = new Scanner(System.in);
		contador++;
		
		do {
		 System.out.println("Menu Calculadora");
		 System.out.println("------------------------------");
		 System.out.println("1. Sumar 2 números");
		 System.out.println("2. Restar 2 números");
		 System.out.println("3. Multiplicar 2 números");
		 System.out.println("4. Dividir 2 números");
		 System.out.println("5. Potencia de dos números (base y exp)");
		 System.out.println("6. Raiz cuadrada de un numero");
		 System.out.println("7. Máximo de dos números");
		 System.out.println("8. Mínimo de 2 números");
		 System.out.println("9. Salir");
		 System.out.println("ELige un opción: ");
		 opcion =teclado.nextInt();
		 
		 System.out.println();
		 
		 switch(opcion) {
		  case 1:
			  System.out.print("Introduzca numero 1: ");
			  num1 = teclado.nextInt();
			  System.out.print("Introduzca numero 2: ");
			  num2 = teclado.nextInt();
			  resultado = num1 + num2;
			  System.out.println("La suma es: "+resultado);
		  break;
		  case 2:
			  System.out.print("Introduzca numero 1: ");
			  num1 = teclado.nextInt();
			  System.out.print("Introduzca numero 2: ");
			  num2 = teclado.nextInt();
			  resultado = num1 - num2;
			  System.out.println("La restar es: "+resultado);
		  break;
		  case 3:
			  System.out.print("Introduzca numero 1: ");
			  num1 = teclado.nextInt();
			  System.out.print("Introduzca numero 2: ");
			  num2 = teclado.nextInt();
			  resultado = num1 * num2;
			  System.out.println("La multiplicación es: "+resultado);
		  break;
		  case 4:
			  System.out.print("Introduzca numero 1: ");
			  num1 = teclado.nextInt();
			  System.out.print("Introduzca numero 2: ");
			  num2 = teclado.nextInt();
			  resultado = num1 / num2;
			  System.out.println("La división es: "+resultado);
		  break;
		  case 5:
			  System.out.print("Introduzca la base: ");
			  num1 = teclado.nextInt();
			  System.out.print("Introduzca el exponente: ");
			  num2 = teclado.nextInt();
			  resultado = (int) Math.pow(num1, num2);
			  System.out.println("El resultado es: "+resultado);
		  break;
		  case 6: System.out.println("la raiz de 1 es 1");
		  break;
		  case 7: System.out.println("EL max de 1 y 2 es 2");
		  break;
		  case 8: System.out.println("El mínimo de 1 y 2 es 1");
		  break;
		  case 9: System.out.println("HASTA LUEGO");
		  break;
		  default: System.out.println("Opcion de valida. Intentelo de nuevo");
		  break;
		  }
		 
		 System.out.println();
		 
		}while(contador<=4);
	}
}
