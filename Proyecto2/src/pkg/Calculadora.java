package pkg;
import java.util.Scanner;

public class Calculadora {

	public static int suma(int a, int b) {
		return (a + b);
	}
	
	public static int resta(int a, int b) {
		return (a-b);
	}
	
	public static int multiplicacion(int a, int b) {
		return (a*b);
	}
	
	public static int division(int a, int b) {
		if (b == 0)
			return -1;
		else return (a/b);
	}
	
	/*public int menu() {
		int a;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("0.- Salir");
			System.out.print("Elija opción: ");
			a = sc.nextInt();
		} while (a < 0 || a > 4);
		return a;
	}
	
	public static void main(String[] args) {
		
	}*/
}
