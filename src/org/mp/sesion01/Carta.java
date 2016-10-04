package org.mp.sesion01;

public class Carta implements Comparable {
	private String palo;
	private int numero;
	private int valor;

	public Carta(String palo, int numero , int valor) {
		this.palo = palo ;
		this.numero = numero;
		this.valor=valor;
		switch (palo){
		case "O":
			this.valor = 0;
			break;



		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	// ToDo....

}
