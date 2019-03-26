package Questao01;

public class AppMainTesteIncremental {
	public static void main(String[] argumentos) {
		for(int i =0;i<10;i++) {
			IncrementalSingleton inc = IncrementalSingleton.getInstance();
			System.out.println(inc);
		}
	}

}
