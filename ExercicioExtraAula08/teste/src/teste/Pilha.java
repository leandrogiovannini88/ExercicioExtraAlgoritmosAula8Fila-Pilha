package teste;



	/*
	Implementando opera��es com pilhas em Java
	Criando a Classe Pilha
	Implementamos as fun��es isEmpty, peek, push e pop
	*/
	public class Pilha {
	   static final int MAX = 1000;
	   int top;
	   int a[] = new int[MAX]; // Define tamanho m�ximo da pilha   

	   // Construtor
	   Pilha() {
	      top = -1;
	   }

	   // M�todos da pilha
	   boolean isEmpty() {
	     return (top < 0);
	   }
	   boolean push(int x) {
	      if (top >= (MAX-1)) {
	         System.out.println("Estouro de Pilha!");
	         return false;
	      }
	      else {
	         a[++top] = x;
	         return true;
	      }
	   }
	   int pop() {
	      if (top < 0) {
	         System.out.println("Pilha Vazia!");
	         return 0;
	      }
	      else {
	         int x = a[top--];
	         return x;
	      }
	   }
	   int peek() {
	      if (top < 0) {
	         System.out.println("Pilha Vazia!");
	         return 0;
	      }
	      else {
	         return a[top];
	      }
	   }
	}


