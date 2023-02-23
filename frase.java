package git;

import java.util.Scanner;

public class frase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String frase=sc.nextLine();
		System.out.print("Introduce un caracter a sustituir: ");
		CharSequence caracter=sc.next();
		
		if(caracter.length()>1) {
			System.out.println("Error");
		}else {
			sustituirCaracter(frase,caracter);
		}
		
		
		
		

	}

	private static void sustituirCaracter(String frase, CharSequence caracter) {
		
		boolean esta=false;
		
		String cambio=frase.replace(caracter, "*");
		
		for(int i=0;i<frase.length();i++) {
			if(cambio.charAt(i)=='*') {
				esta=true;
			}
		}
		
		if(esta) {
			System.out.println(cambio);
		}else {
			System.out.println("Caracter no encontrado");
		}
	}

}
