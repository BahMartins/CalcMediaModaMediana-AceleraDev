package br.com.codenation;


import java.util.ArrayList;
import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {

		int somaElementos = 0;

		for (int elemento: elements){
			somaElementos += elemento;
		}

		return (somaElementos/elements.length);
	}

	public static int mode(int[] elements) {

		int resultado = 0;
		int quantidadeDeVezes = 0;

		for (int i = 0; i < elements.length; i++){
			int count = 0;
			for(int j = 0; j < elements.length; j++){
				if(elements[i] == elements[j]){
					count++;
				}
			}
			if (count > quantidadeDeVezes){
				resultado = elements[i];
				quantidadeDeVezes = count;
			}

		}

		return resultado;
	}

	public static int median(int[] elements) {

		Arrays.sort(elements);

		int tipoArray = elements.length % 2;
		int tamanhoArray = elements.length;
		int resultado = 0;

		if (tipoArray == 1 ){
			resultado = elements[tamanhoArray / 2 ];

		}else {
			int media = tamanhoArray / 2;

			resultado =  ( elements[ media ]  + elements[ media - 1 ]) / 2 ;
		}

		return resultado;
	}
}