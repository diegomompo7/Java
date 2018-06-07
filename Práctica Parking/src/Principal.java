
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int filas = 5;
		int columnas = 10;
		int [][] matriz = new int[filas][columnas];	
		
		int fila=0, columna=0;
		
		// inicializarMatriz(matriz, filas, columna);
		
		imprimirMatriz(matriz, filas, columna);
		System.out.println();

	}

	private static void imprimirMatriz(int[][] matriz, int filas, int columnas) {
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				if ((i==0)  || (j==1)){
					matriz[i][j]='X';
				}
				else {
					matriz[i][j]=' ';
				}
			}
		}
	}

/*	private static void inicializarMatriz(int[][] matriz, int filas, int columnas) {
		for(int i=0; i<filas; i++) {
			for (int j=0; j<columnas; j++) {
				if ((i==0)  || (j==1)){
					matriz[i][j]='X';
				}
				else {
					matriz[i][j]=' ';
				}
			}
		}
	} */
}

