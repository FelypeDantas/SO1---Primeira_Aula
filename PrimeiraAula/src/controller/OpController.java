package controller;

public class OpController {

	public OpController() {
		super();
	}
	
	public void concatenaString() {
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 1000; i++) {
			cadeia = cadeia + 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String ==> " + tempoTotal + "s.");
	}
	
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 1000; i++) {
			buffer.append("0");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer ==> " + tempoTotal + "s.");
	}
	
	public void divideInteiro1000(int inteiro) {
		int vetor[] = new int[1000];
		for(int zero: vetor) {
			System.out.println(zero);
		}
	}
	
	public void concatenaString2() {
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 10000; i++) {
			cadeia = cadeia + 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String ==> " + tempoTotal + "s.");
	}
	
	public void concatenaBuffer2() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 10000; i++) {
			buffer.append("0");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer ==> " + tempoTotal + "s.");
	}
	
	public void divideInteiro10000(int inteiro) {
		int vetor[] = new int[10000];
		for(int zero: vetor) {
			System.out.println(zero);
		}
	}
	
	public void concatenaString3() {
		String cadeia = "";
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 100000; i++) {
			cadeia = cadeia + 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("String ==> " + tempoTotal + "s.");
	}
	
	public void concatenaBuffer3() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for(int i=0; i < 100000; i++) {
			buffer.append("0");
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Buffer ==> " + tempoTotal + "s.");
	}
	
	public void divideInteiro100000(int inteiro) {
		int vetor[] = new int[10000];
		for(int zero: vetor) {
			System.out.println(zero);
		}
	}
	
}
