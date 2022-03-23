package imc;

import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner (System.in);
		double peso , altura, imc ;
		System.out.println("Qual é o seu peso: ");
		peso=teclado.nextDouble();
		
		System.out.println("Qual é a sua altura: ");
		altura=teclado.nextDouble();
		System.out.println("A minha altura é " + altura +".");
		
		Scanner genero=new Scanner(System.in);
		System.out.println("Qual é o seu sexo?");
		String sexo;
		sexo=genero.nextLine();
		switch(sexo){
				case "m" :
				case "M" :
				case "Masculino":
				case "masculino":
				System.out.println("Sexo Masculino");
				imc= peso/(altura*altura);
				System.out.printf("%.2f%n",imc);
				if(imc<20.7) {
				System.out.printf("Abaixo do peso");
				} else if(imc<=26.4){
					System.out.println("no Peso nomral ");
				}else if(imc<=27.8) {
					System.out.println("Marginalmente acima do peso.");
				}else if(imc<=31.1) {
					System.out.println("Acima do peso ideal");
				}else {
					System.out.println("Obeso");
				}
			if(imc<=25.8)	
			break;
		}
			switch(sexo) {
			case "f":
			case "F":
				System.out.println("Sexo Feminino");
				imc=peso/(altura*altura);
				System.out.println(imc);
			if(imc<=19.1) {
				System.out.println("Abaixo do peso.");
			}else if (imc<=20.4) {
				System.out.println("No peso normal");
			}else if (imc<=27.8) {
				System.out.println("Marginalmente acima do peso");
			}else if (imc <31.1) {
				System.out.println("Acima do peso ideal ");
			}else {
				System.out.println("Obeso");
			}
			
				
				break;
		}
	
	}
}
