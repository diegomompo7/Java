
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static int recaudacion = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int filas = 5;
		int columnas = 10;
		char [][] matriz = new char[filas][columnas];
		
		String matricula = null;
		String marca = null;
		String modelo = null;
		String dni = null;
		boolean electrico = false;
		int cilindrada = 0;
		int numero_de_plazas = 0;
		char compania = 0;
		
		int opcion = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		
		inicializarMatriz(matriz, filas, columnas);
		do {
		System.out.println("          PARKING             ");
		System.out.println("******************************");
		System.out.println("* 1. Ver Parking           ***");
		System.out.println("* 2. Entrada de un coche   ***");
		System.out.println("* 3. Entrada de una moto   ***");
		System.out.println("* 4. Entrada de un autobús ***");
		System.out.println("* 5. Salida de un vehículo ***");
		System.out.println("* 6. Ver recaudación       ***");
		System.out.println("* 7. Salir del programa    ***");
		System.out.println("\n");
		System.out.print("Introduzca opcion: ");
		opcion = teclado.nextInt();
		
		System.out.println("\n");
		
		switch(opcion){
		case 1:
			imprimirMatriz(matriz, filas, columnas);
			System.out.println("\n");
			break;
		case 2:
			if (ParkingLleno(matriz, filas, columnas)) {
				System.out.println("¡¡¡PARKING LLENO!!!");
			}
			else {
			Aparcarcoche(matriz, filas, columnas, teclado);
			}
			System.out.println("\n");
			break;
		case 3:
			if (ParkingLleno(matriz, filas, columnas)) {
				System.out.println("¡¡¡PARKING LLENO!!!");
			}
			else {
			Aparcarmotos(matriz, filas, columnas, teclado);
			}
			System.out.println("\n");
			break;
		case 4:
			if (ParkingLleno(matriz, filas, columnas)) {
				System.out.println("¡¡¡PARKING LLENO!!!");
			}
			else {
			Aparcarbus(matriz, filas, columnas, teclado);
			}
			System.out.println("\n");
			break;
		case 5:
			Desaparcar(matriz, filas, columnas, teclado);
			break;
		case 6:
			System.out.println("Recaudación Total es: "+recaudacion+" euros\n");
			break;
		case 7:
			System.out.println("SALIENDO DEL PROGRAMA, QUE PASE UN BUEN DÍA");
			System.exit(0);
			break;
			
		default:
			System.out.println("Opcion no valida, intente de nuevo");
			break;
		}
	}while(opcion < 8);
		

	}

	private static void Aparcarbus(char[][] matriz, int filas, int columnas, Scanner teclado) {
		
		try {
			System.out.print("Introduzca fila: ");
			int fila = teclado.nextInt();
			System.out.print("Introduzca columna: ");
			int columna = teclado.nextInt();
			teclado.nextLine();
			
			if ((matriz[fila][columna]=='X') || (matriz[fila][columna]=='P') || (matriz[fila][columna]=='E') || (matriz[fila][columna]=='S')) {
				System.out.println("Plaza no válida. Inténtelo de nuevo");
			}
			else if(!(0 < fila && fila < filas && 0 < columna && columna < columnas)){
				System.out.println("No existe plaza en esa posición");
			}
			else if(!(matriz[fila][columna]==' ')){
				System.out.println("Lo siento, esa plaza está ocupada");			
			}
			else {
				teclado.reset();
				System.out.print("Matrícula: ");
				String matricula = teclado.nextLine();
				
				System.out.print("Marca: ");
				String marca = teclado.nextLine();
				
				System.out.print("Modelo: ");
				String modelo = teclado.nextLine();
				
				System.out.print("Número de plazas: ");
				int numero_de_plazas = teclado.nextInt();
				teclado.nextLine();
				
				System.out.print("Compañia: ");
				String compania = teclado.nextLine();
				
				matriz[fila][columna]='A';
				recaudacion += 10;
				
				System.out.println("La matrícula es: " +matricula);
				System.out.println("La marca es: " +marca);
				System.out.println("El modelo es: " +modelo);
				System.out.println("El número de plazas es: " +numero_de_plazas);
				System.out.println("La compañia es: " +compania);
			}
			
			System.out.println("\n");
			}
			catch (InputMismatchException error) {
				System.out.println("Ha introducido un valor incorrecto");
			}catch (ArrayIndexOutOfBoundsException error) {
				System.out.println("El valor introducido no es correcto");
			}
			
		
	}

	private static void Aparcarmotos(char[][] matriz, int filas, int columnas, Scanner teclado) {
		
		try {
			System.out.print("Introduzca fila: ");
			int fila = teclado.nextInt();
			System.out.print("Introduzca columna: ");
			int columna = teclado.nextInt();
			teclado.nextLine();
			
			if ((matriz[fila][columna]=='X') || (matriz[fila][columna]=='P') || (matriz[fila][columna]=='E') || (matriz[fila][columna]=='S')) {
				System.out.println("Plaza no válida. Inténtelo de nuevo");
			}
			else if(!(0 < fila && fila < filas && 0 < columna && columna < columnas)){
				System.out.println("No existe plaza en esa posición");
			}
			else if(!(matriz[fila][columna]==' ')){
				System.out.println("Lo siento, esa plaza está ocupada");			
			}
			else {
				teclado.reset();
				System.out.print("Matrícula: ");
				String matricula = teclado.nextLine();
				
				System.out.print("Marca: ");
				String marca = teclado.nextLine();
				
				System.out.print("Modelo: ");
				String modelo = teclado.nextLine();
				
				System.out.print("Cilindrada: ");
				int cilindrada = teclado.nextInt();
				
				matriz[fila][columna]='M';
				recaudacion += 3;
				
				System.out.println("La matrícula es: " +matricula);
				System.out.println("La marca es: " +marca);
				System.out.println("El modelo es: " +modelo);
				System.out.println("La cilidrada es de: " +cilindrada);

			}
			
			System.out.println("\n");
			}
			catch (InputMismatchException error) {
				System.out.println("Ha introducido un valor incorrecto");
			}catch (ArrayIndexOutOfBoundsException error) {
				System.out.println("El valor introducido no es correcto");
			}
			
	
		
	}

	private static void Aparcarcoche(char[][] matriz, int filas, int columnas, Scanner teclado) {
		try {
		System.out.print("Introduzca fila: ");
		int fila = teclado.nextInt();
		System.out.print("Introduzca columna: ");
		int columna = teclado.nextInt();
		teclado.nextLine();
		
		if ((matriz[fila][columna]=='X') || (matriz[fila][columna]=='P') || (matriz[fila][columna]=='E') || (matriz[fila][columna]=='S')) {
			System.out.println("Plaza no válida. Inténtelo de nuevo");
		}
		else if(!(0 < fila && fila < filas && 0 < columna && columna < columnas)){
			System.out.println("No existe plaza en esa posición");
		}
		else if(!(matriz[fila][columna]==' ')){
			System.out.println("Lo siento, esa plaza está ocupada");			
		}
		else {
			teclado.reset();
			System.out.print("Matrícula: ");
			String matricula = teclado.nextLine();
			
			System.out.print("Marca: ");
			String marca = teclado.nextLine();
			
			System.out.print("Modelo: ");
			String modelo = teclado.nextLine();
			
			System.out.print("DNI: ");
			String dni = teclado.nextLine();
			
			System.out.print("Electrico(0 o 1): ");
			int electricoint = teclado.nextInt();
			boolean electrico = false;
			if(electricoint == 1) {
				electrico = true;
			}
			
	
			matriz[fila][columna]='C';
			recaudacion += 5;
			
			System.out.println("La matrícula es: " +matricula);
			System.out.println("La marca es: " +marca);
			System.out.println("El modelo es: " +modelo);
			System.out.println("El DNI es: " +dni);
			System.out.print("El coche ");
			if(!electrico) System.out.print("no");
			System.out.println(" es electrico");

		}
		
		System.out.println("\n");
		}
		catch (InputMismatchException error) {
			System.out.println("Ha introducido un valor incorrecto");
		}catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("El valor introducido no es correcto");
		}
		}
	

	private static void imprimirMatriz(char [][] matriz, int filas, int columnas) {
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas;j++) {
					System.out.print(matriz[i][j]+ " ");
			}
			System.out.print("\n");
		}
	}
	
	private static void inicializarMatriz(char[][] matriz, int filas, int columnas) {
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {			
				if (((i ==0 || i==(filas-1)) && (j==0||j==(columnas-1))) ||(j==0 && i==2)){
					matriz[i][j]='X';
				}
				else if(((i==0||i==(filas-1))&&(j>0 && j<(columnas-1)))||(j==(columnas-1)&&(i!=0 && i!=(filas-1)))){
					matriz[i][j]='P';
				}
				else if ((i==1 && j==0)) {
					matriz[i][j]='E';
				}
				else if ((i==3 && j==0)) {
					matriz[i][j]='S';
				}
				else {
					matriz[i][j]=' ';
				}
			}
		}
	}
	private static boolean ParkingLleno(char[][] matriz, int filas, int columnas) {
		for(int i=1; i<(filas-1); i++) {
			for (int j=1; j<(columnas-1); j++) {
					if(matriz[i][j] == ' ') {
						return false;
					}
			}
		}
		return true;
	}
	
	private static void Desaparcar(char[][] matriz, int filas, int columnas, Scanner teclado) {
		try {
		System.out.print("Introduzca fila: ");
		int fila = teclado.nextInt();
		System.out.print("Introduzca columna: ");
		int columna = teclado.nextInt();
		
		if ((matriz[fila][columna]=='X') || (matriz[fila][columna]=='P') || (matriz[fila][columna]=='E') || (matriz[fila][columna]=='S')) {
			System.out.println("Plaza no válida. Inténtelo de nuevo");
		}
		else if(!(0 < fila && fila < filas && 0 < columna && columna < columnas)){
			System.out.println("No existe plaza en esa posición");
		}
		else if(matriz[fila][columna]==' '){
			System.out.println("Lo siento, no hay vehículo en esa plaza");			
		}
		else {
			matriz[fila][columna]=' ';
		}
		
		System.out.println("\n");
		}
		catch (InputMismatchException error) {
			System.out.println("Ha introducido un valor incorrecto");
		}catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("El valor introducido no es correcto");
		}
		}
	
	
}
