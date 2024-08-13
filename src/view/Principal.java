package view;

import controller.ControllerInverte;

public class Principal {

	public static void main(String[] args) {
		ControllerInverte contInv = new ControllerInverte();
		int[] vetor = {0,1,2,3,4,5,6,7,8,9};
		int indiceEsq = 0;
		int indiceDir = vetor.length - 1;
		int tamanho = vetor.length;
		
		vetor = contInv.inverteVetor(vetor, indiceEsq, indiceDir);
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(vetor[i]);
		}
	}

}
