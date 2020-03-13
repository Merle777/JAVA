	package Basics;

import java.util.ArrayList;
import java.util.List;

public class BasicJava {
		
		public void basicArray(int num) {
			for (int i = 1; i < num; i++){
				System.out.println (i);
			}
		}
		
		public void imparArray (int num) {
			for (int i = 1; i < num; i+=2) {
				System.out.println (i);
			}
		}
		
		public void sumArray(int num) {
			int sum = 0;
			for (int i = 0; i < num; i++){
				sum = sum + i;
				System.out.println ("Nuevo numero: " + i + " Suma: " + sum); 
			}
		}
		
		public void recorreArray(List<Integer> lista) {
			for (Integer valor:lista){
				System.out.println (valor); 
			}
			for (Integer i = 0; i < lista.size(); i++) {
				Integer valor = lista.get(i);
				System.out.println(valor);
			}
		}
			
		public void maxArray(List<Integer> lista) {
			int max = lista.get(0);
			for (Integer i = 1; i < lista.size(); i++){ 
				if(lista.get(i) > max) {
					max = lista.get(i);
					System.out.println(max);
				}
			}
		}
			
		public void avgArray(List<Integer> lista) {
			double prom = 0;
			for (Integer i = 0; i < lista.size(); i++){ 
				prom = prom + lista.get(i);		
			}
			System.out.println(prom/lista.size());
		}	
		
		
		public void imparesArray(List<Integer> lista) {
			for (Integer i = 1 ; i < 256; i+=2){ 
				lista.add(i);				
			}
			System.out.println(lista);	
		}

		public void mayorArray(ArrayList<Integer> lista) {
			int y = 3;
			for (Integer i = 0 ; i < lista.size(); i++){
				if (lista.get(i) > y) {
					System.out.println(lista.get(i));
				}
			}
		}
		
		public void cuadrArray(ArrayList<Integer> lista) {
			for (Integer i = 0 ; i < lista.size(); i++){
				lista.set(i, lista.get(i) * lista.get(i));
			}
			System.out.println(lista);
		}
	
		public void negArray(ArrayList<Integer> lista) {
			for (Integer i = 0 ; i < lista.size(); i++){
				if (lista.get(i) < 0) {
					lista.set(i, 0);
				}
				System.out.println(lista);
			}
		}
		
		public void mmpArray(ArrayList<Integer> lista) {
			int max = lista.get(0);
			int min = lista.get(0);
			double prom = 0;
			for (Integer i = 0 ; i < lista.size(); i++){
				if(lista.get(i) > max) {
					max = lista.get(i);	
				}
				if(lista.get(i) < min) {
					min = lista.get(i);
				}
				prom = prom + lista.get(i);		
			}
			System.out.println(max);
			System.out.println(min);
			System.out.println(prom/lista.size());
		}

		public void changeArray(ArrayList<Integer> lista) {
			for (Integer i = 1 ; i < lista.size(); i++){
				lista.set(i-1, lista.get(i));
			}
			lista.set(lista.size() - 1, 0);
			System.out.println(lista);
		}
	}	
			