//6. Fa�a uma fun��o recursiva que, dado um vetor, inverta seus valores (O valor que est� na posi��o zero troca de lugar com o valor que est� na �ltima posi��o, o valor que est� na posi��o um troca de lugar com o valor que est� na pen�ltima posi��o e assim por diante). Testar com um vetor de 10 e um de 11 posi��es.
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
