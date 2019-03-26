package Questao01;

public class IncrementalSingleton {
	private static IncrementalSingleton incremental;
	private static int count = 0;
	private int numero = 0;

	public static IncrementalSingleton getInstance() {

		incremental = new IncrementalSingleton();

		return incremental;
	}

	private IncrementalSingleton() {

		this.numero = ++count;

	}

	public String toString() {
		return "Incremental " + this.numero;
	}

}
