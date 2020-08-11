package PacoteJavaExec;

import java.util.Scanner;

public class ExecLrep2 {

	public static void main(String[] args) {
		int a,s,b;
		System.out.printf("Digite um número inteiro! \n");
		Scanner ler = new Scanner(System.in);
		a =ler.nextInt();
		if(a%2==0) {
			System.out.printf("Esse número é par ");
			s = (int) Math.sqrt(a);
			System.out.printf("e possui raíz quadrada igual a:"+s);
		}else {
			System.out.printf("Esse número é ímpar ");
			b = (int) Math.pow(a, 2);
			System.out.printf("e elevado ao quadrado é igual a:"+b);
		}
	}

}
