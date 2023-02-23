package git;

import java.util.Scanner;

public class parlmpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String numeros=sc.nextLine();
		int total=sumar(numeros);

		if(total%2==0) {
			System.out.println(total+" es par");
		}else {
			System.out.println(total+" es impar");
		}
		
	}

	private static int sumar(String numeros) {
		
		int Xnum;
		int total=0;
		String[] numero=numeros.split(",");
		
		for(int i=0;i<numero.length;i++) {
			Xnum=Integer.parseInt(numero[i]);
			total+=Xnum;
		}
		
		return total;
		
	}

}
