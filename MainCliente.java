package Questao02;

import java.io.InputStream;
import java.util.Scanner;

public class MainCliente {
	public static void main(String[] argumentos) {
		
		FactoryVeiculo fabrica = new FactoryVeiculo();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("====FABRICA DE VEICULO=====");

		System.out.println("QUAL CARRO VOCE QUER?");
		System.out.println("BMW OU FERRARI");

		String teclado1 = sc1.nextLine();
		Carro meuCarro = fabrica.criarCarro(teclado1);

		System.out.println("====FABRICA DE VEICULO=====");
		System.out.println("QUAL MOTO VOCE QUER?");
		System.out.println("BIZ OU TRAX");

		String teclado2 = sc1.nextLine();
		Moto minhaMoto = fabrica.criarMoto(teclado2);

		System.out.println("Aqui esta os seus veiculos");
		System.out.println("Carro    " + meuCarro);
		System.out.println("Moto     " + minhaMoto);

	}

}
