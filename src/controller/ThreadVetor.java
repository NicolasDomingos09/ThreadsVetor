package controller;

public class ThreadVetor extends Thread {

	private int opc;
	private int[] arrNumerico;
	
	public ThreadVetor(int opc, int[] arr) {
		this.opc = opc;
		this.arrNumerico = arr;
	}

	@Override
	public void run() {
		percorreVetor(opc, arrNumerico);
	}

	private void percorreVetor(int opc, int[] arr) {
		double tempoInicial = System.nanoTime();
		
		if(opc % 2 == 0) {
			System.out.println("Par");
			for(int i = 0; i < arr.length; i++) {}
		}else {
			System.out.println("Ímpar");
			for(int i : arr) {}
		}
		
		double tempoFinal = System.nanoTime();
		double tempo = tempoFinal - tempoInicial;
		tempo /=(Math.pow(10, 9));
		
		System.out.println("Tempo para percorrer o vetor: " + tempo + "s.");
	}

}
