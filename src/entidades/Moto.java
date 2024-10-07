package entidades;

import interfaces.Veiculo;
import util.VeiculoUtil;

public class Moto extends VeiculoUtil implements Veiculo{
	
	private int velocidadeAtual;
	private String tipoCombustivel;
	


	public Moto(int velocidadeAtual, String tipoCombustivel) {
		this.velocidadeAtual = velocidadeAtual;
		this.tipoCombustivel = tipoCombustivel;
	}

	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public void acelerar() {
		velocidadeAtual += 15;
        System.out.println("Moto acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
		
	}

	@Override
	public void freiar() {
		 velocidadeAtual -= 7;
	        System.out.println("Moto freando. Velocidade atual: " + velocidadeAtual + " km/h");
	}

	@Override
	public String getTipoCombustivel() {
		return this.tipoCombustivel;
	}

}
