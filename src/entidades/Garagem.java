package entidades;

import java.util.ArrayList;
import java.util.List;

import interfaces.Veiculo;

public class Garagem {
	
	
	private List <Veiculo> listaVeiculos = new ArrayList<>();
	
	
	public void adicionarVeiculos(Veiculo veiculo) {
		listaVeiculos.add(veiculo);
		System.out.println("Veiculo adicionado na garagem!");
	}
	
	public void listarVeiculos() {
		for (Veiculo veiculoUtil : listaVeiculos) {
			System.out.println("Tipo de combustível: " + veiculoUtil.getTipoCombustivel());
		}
	}
	
}
