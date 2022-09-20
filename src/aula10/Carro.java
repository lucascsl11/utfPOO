package aula10;

public class Carro {
	private int velocidade, marcha;
	
	public Carro() {
		this.velocidade = 0;
		this.marcha = 0;
	}
	
	public int getMarcha() {
		return marcha;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar() {
		if((velocidade + 5) > 130) {
			velocidade = 130;
			System.out.println("Velocidade maxima atingida!");
			return;
		}
		velocidade += 5;
		this.trocarMarcha();
	}
	public void frear() {
		if((velocidade - 5) < 0) {
			velocidade = 0;
			System.out.println("Carro parado");
			return;
		}
		velocidade -= 5;
		this.trocarMarcha();
	}
	
	private void trocarMarcha() {
		if(this.velocidade >= 1 && this.velocidade < 20) {
			this.marcha = 1;
		}
		else if(this.velocidade >= 20 && this.velocidade < 40) {
			this.marcha = 2;
		}
		else if(this.velocidade >= 40 && this.velocidade < 60) {
			this.marcha = 3;
		}
		else if(this.velocidade >= 60 && this.velocidade < 90) {
			this.marcha = 4;
		}
		else if(this.velocidade >= 90 && this.velocidade < 130) {
			this.marcha = 5;
		}
		else {
			this.marcha = 0;
		}
	}
}
