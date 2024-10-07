package entidades;

import interfaces.Veiculo;
import util.VeiculoUtil;

public class Carro extends VeiculoUtil implements Veiculo{
	
	private int velocidadeAtual;
	private String tipoCombustivel;
	
	
	public Carro(int velocidadeAtual, String tipoCombustivel) {
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
		velocidadeAtual += 10;
        System.out.println("Carro acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
		
	}

	@Override
	public void freiar() {
		velocidadeAtual -= 5;
        System.out.println("Carro freando. Velocidade atual: " + velocidadeAtual + " km/h");		
	}

	@Override
	public String getTipoCombustivel() {
		return this.tipoCombustivel;
		
	}
	
	public void ligarArCondicionado() {
		System.out.println("Ar-condicionado ligado no carro.");
	}
	

}
