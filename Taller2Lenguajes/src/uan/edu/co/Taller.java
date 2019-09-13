package uan.edu.co;

import java.util.Scanner;

public class Taller {

	public static void main(String args[]) {

		char[] miLafabeto = { 'a', 'b' };
		int cuentaA = 0;
		int cuentaB = 0;
		String ingresoPalabra;
		boolean validezPar = false;
		boolean validezCaracter = false;
		
		Scanner miEntrada = new Scanner(System.in);

		System.out.println("Ingrese una palabra: ");
		ingresoPalabra = miEntrada.nextLine();
		miEntrada.close();

		char[] alfabetoConvertido = new char[ingresoPalabra.length()];
		alfabetoConvertido = ingresoPalabra.toCharArray();

		System.out.println();
		//Para verificar que tenga el alfabeto
		for (int i = 0; i < alfabetoConvertido.length; i++) {
			if (alfabetoConvertido[i] != 'a' && alfabetoConvertido[i] != 'b' ) {
				
				i = alfabetoConvertido.length;
				validezCaracter = false;
			}else {
				validezCaracter = true;
			}
			
		}
			
		//Para verificar que sea par
		for (int i = 0; i < alfabetoConvertido.length; i++) {	
			if (alfabetoConvertido[i] == 'a') {
				cuentaA++;
			}
			if (alfabetoConvertido[i] == 'b') {
				cuentaB++;
			}
			
		}
		
		if( cuentaA % 2 == 0 && cuentaB % 2 == 0) {
			validezPar = true;
		}else {
			validezPar = false;
		}

		if(validezCaracter == true && validezPar == true) {
			System.out.println("La cadena " + ingresoPalabra + " es aceptada"
					+ "\nSu longitud de aes es: " + cuentaA 
							+ "\nSu longitud de bes es: " + cuentaB);
		}else {
			System.out.println("No es aceptada");
		}
		
		
	}

}
