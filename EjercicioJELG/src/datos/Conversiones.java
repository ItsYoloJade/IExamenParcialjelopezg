package datos;

import java.util.Scanner;

public class Conversiones {
	
 
	public static void lectura () {
		imprimirMenu();
		
	}
	 static Scanner entrada = new Scanner (System.in);
	 static  int opcion; 
	  
	 
	
	public static  void Salida() {
		System.exit(0);
	}
	
	public static  void converbytesTOkilobytes() {
		 float num;
		  float conver;
		 System.out.println("Ingrese el numero que desea convertir");
		 num= entrada.nextFloat();
		 conver = num /1000;
		 System.out.println("Dicha cantidad equivale a "+conver+" en Kilobytes");
		 System.out.println();
		
	}
	public static void converkiloTOmegabytes() {
		 float num2;
		  float conver2;
	 System.out.println("Ingrese el numero que desea convertir");
	 num2= entrada.nextFloat();
	 conver2 = num2/1024;
	 System.out.println("Dicha cantidad equivale a "+conver2+" en megabytes");
	 System.out.println();
	}
	
	
	public static void imprimirMenu() {
	 System.out.println("------BIENVENIDO-----");
	 System.out.println();
	 System.out.println("1. Convertir bytes a kilobytes");
	 System.out.println("2. convertir kilobytes a megabytes");
	 System.out.println("3. Salir");
	 System.out.println();
	 opcion = entrada.nextInt();
	 
	 
	 switch(opcion){
	 case 1:{
		 converbytesTOkilobytes();
		 imprimirMenu();
		 System.out.println();
	 }
	 case 2: {
		 converkiloTOmegabytes(); 
		 imprimirMenu();
		 System.out.println();
	 }
	 case 3:{
		 Salida();
	 }
		default:
			System.out.println("Ha ingresado una opcion invalida");
			 imprimirMenu();
			 System.out.println();
			
	 }
	
 
 }

}
