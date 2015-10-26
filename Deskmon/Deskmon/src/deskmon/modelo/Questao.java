package deskmon.modelo;

public class Questao {

	private String texto;
	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;
	private int dificuldade;
	private int resposta;
	//private int porcentagemAcertos;
	private String materia;

	
	
	public Questao(String texto, String alternativa1, String alternativa2, String alternativa3, String alternativa4,
			int dificuldade, int resposta, String materia) {
		super();
		this.texto = texto;
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativa4 = alternativa4;
		this.dificuldade = dificuldade;
		this.resposta = resposta;
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public String getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public String getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}

	public String getAlternativa4() {
		return alternativa4;
	}

	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	/*public int getPorcentagemAcertos() {
		return porcentagemAcertos;
	}

	public void setPorcentagemAcertos(int porcentagemAcertos) {
		this.porcentagemAcertos = porcentagemAcertos;
	}
	*/
}
