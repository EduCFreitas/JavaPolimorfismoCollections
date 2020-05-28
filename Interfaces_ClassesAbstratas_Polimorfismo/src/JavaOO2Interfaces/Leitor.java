package JavaOO2Interfaces;

interface Leitor {
	String lendo();
}

interface Programador {
	void pensando(char[] ideias);
	String digitando();
}

class ParticipanteForum implements Leitor, Programador{
	String pensamento;
	public String lendo() { // Método definido na interface Leitor
		return "Forum";
	}
	public void pensando(char[] ideias) { // Método definido na interface Programador
		pensamento = new String(ideias);
	}
	public String digitando() { // Método definido na interface Programador
		return pensamento;
	}
	private String aprendendo() { // Método esclusivo desta classe
		return "Java";
	}
}
