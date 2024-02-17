package view;

import controller.OpController;

public class Principal {

	public static void main(String[] args) {
		
		OpController op = new OpController();
		
		System.out.println("Tempo e resultado de vetor inteiro de 1000 posições");
		System.out.println("====================================================");
		
		op.concatenaBuffer();
		op.concatenaString();
		
		System.out.println("====================================================");
		
		op.divideInteiro1000(0);
		
		System.out.println("=====================================================");
		
		System.out.println("Tempo e resultado de vetor inteiro de 10000 posições");
		System.out.println("=====================================================");
		
		op.concatenaBuffer2();
		op.concatenaString2();
		
		System.out.println("=====================================================");
		
		op.divideInteiro10000(0);
		
		System.out.println("=====================================================");
		System.out.println("Tempo e resultado de vetor inteiro de 100000 posições");
		System.out.println("=====================================================");
		op.concatenaBuffer3();
		op.concatenaString3();
		System.out.println("=====================================================");
		op.divideInteiro100000(0);
	}
}
