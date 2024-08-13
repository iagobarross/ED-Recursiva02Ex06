//6. Faça uma função recursiva que, dado um vetor, inverta seus valores (O valor que está na posição zero troca de lugar com o valor que está na última posição, o valor que está na posição um troca de lugar com o valor que está na penúltima posição e assim por diante). Testar com um vetor de 10 e um de 11 posições.
package controller;

public class ControllerInverte {
	
	public ControllerInverte() {
		super();
	}
	
	public int [] inverteVetor(int[] vet, int indiceEsquerda, int indiceDireita) {
		int aux;
		if (indiceDireita == indiceEsquerda) {
			return vet;
		} else  if (indiceDireita - indiceEsquerda == 1){
			aux = vet[indiceDireita];
			vet[indiceDireita] = vet[indiceEsquerda];
			vet[indiceEsquerda] = aux;
			return vet;
		} else {
			aux = vet[indiceDireita];
			vet[indiceDireita] = vet[indiceEsquerda];
			vet[indiceEsquerda] = aux;
			return inverteVetor(vet, indiceEsquerda + 1, indiceDireita - 1);
		}
	}
} 
