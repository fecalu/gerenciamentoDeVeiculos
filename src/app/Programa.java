package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Carro;
import entidades.Garagem;
import entidades.Moto;
import interfaces.Veiculo;
import util.VeiculoUtil;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Garagem garagemDoFelipe = new Garagem();
		
		
		Veiculo carro1 = new Carro(0, "Flex");
		Veiculo moto1 = new Moto(0, "Gasolina");
		
		garagemDoFelipe.adicionarVeiculos(moto1);
		garagemDoFelipe.adicionarVeiculos(carro1);
		
		
		
		garagemDoFelipe.listarVeiculos();
		
		
		
		sc.close();

	}

}
