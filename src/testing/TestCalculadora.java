package testing;

import dao.CalculadoraDao;
import dao.CalculadoraDaoImpl;

public class TestCalculadora {
	
	public static void main(String[] args) {
		CalculadoraDao cdao = new CalculadoraDaoImpl();
		
		System.out.println(cdao.sumar(20, 5));
		System.out.println(cdao.restar(20, 5));
		System.out.println(cdao.restar(5, 20));
		System.out.println(cdao.multiplicar(20, 5));
		System.out.println(cdao.dividir(20, 5));
		System.out.println(cdao.dividir(5, 20));
		System.out.println(cdao.resto(20, 3));
		System.out.println(cdao.resto(7, 14));
		
	}

}
