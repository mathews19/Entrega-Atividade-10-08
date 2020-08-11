package PacoteJavaExec;

import java.util.Scanner;

public class ExecLRep {

	public static void main(String[] args) {
		int idade;
		System.out.printf("Entre com a idade da pessoa!!\n");
		Scanner ler = new Scanner(System.in);
		idade = ler.nextInt();
		if(idade>=25) {
			System.out.printf("Maior que a idade de 25!");
		}else {
			if(idade>=18) {
				System.out.printf("Adulto !");
			}else {
				if(idade>=15) {
					System.out.printf("Juvenil ");
				}else {
					if(idade>=10) {
						System.out.printf("Infantil !");
					}else {
							System.out.printf("Idade insuficiente para cadastro");
						}
					}
				}
			}
		}
	}


