package slide64;

public class Programador extends Funcionario {
	private String linguagem;
	private String ferramenta;
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getFerramenta() {
		return ferramenta;
	}
	public void setFerramenta(String ferramenta) {
		this.ferramenta = ferramenta;
	}
	public void imprimirProgramador(){
		this.imprimirCompleto();
		System.out.println("programa em "+ this.getLinguagem() + " e usa a ferramenta " + this.getFerramenta() + ".\n");
	}	
}
