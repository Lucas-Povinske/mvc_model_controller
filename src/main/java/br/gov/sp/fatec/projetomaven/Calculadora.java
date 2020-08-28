package br.gov.sp.fatec.projetomaven;

public class Calculadora {
	/* DECLARA��O DE VARI�VEIS */
	private Integer n1, n2;
	
	/* CONSTRUTOR */
	public Calculadora (Integer n1, Integer n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	/* CONSTRUTOR PADR�O : INICIALIZA OS DOIS VALORES COMO '1' */
	public Calculadora() {
		this(1, 1);
	}
	
	/* DECLARA��O DE M�TODOS */
	public Integer soma() {
		return n1 + n2;
	}
}
