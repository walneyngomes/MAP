package Questao02;

public class FactoryVeiculo {

	public Carro criarCarro(String tipo) {
		Carro carro = null;
		if ("Ferrari".equals(tipo)) {
			carro = new CarroFerrari();
			carro.marca();
			carro.motor();
			carro.numeroPortas();
			carro.preco();
			carro.tipoVeiculo();
			carro.embabalar();
		} else if ("BMW".equals(tipo)) {
			carro = new CarroBMW();
			carro.marca();
			carro.motor();
			carro.numeroPortas();
			carro.preco();
			carro.tipoVeiculo();
			carro.embabalar();
		}
		return carro;

	}

	public Moto criarMoto(String tipo) {
		Moto moto = null;
		if ("BIZ".equals(tipo)) {
			moto = new MotoBiz();
			moto.marca();
			moto.motor();
			moto.preco();
			moto.tipoVeiculo();
			moto.embabalar();
		} else if ("Traxx".equals(tipo)) {
			moto = new MotoTraxx();
			moto = new MotoBiz();
			moto.marca();
			moto.motor();
			moto.preco();
			moto.tipoVeiculo();
			moto.embabalar();
		}
		return moto;
	}

}
