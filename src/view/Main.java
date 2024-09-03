package view;

import controller.ThreadVetor;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] arr = new int[1000];
		int tamanhoArr = arr.length;
		
		for(int i = 0; i < tamanhoArr; i++) {
			arr[i] = rand.nextInt(100); 
		}
		
		for(int i = 0; i < 2; i++) {
			Thread t = new ThreadVetor((i+1), arr);
			t.start();
		}
	}
}
