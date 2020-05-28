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
	public String lendo() { // M�todo definido na interface Leitor
		return "Forum";
	}
	public void pensando(char[] ideias) { // M�todo definido na interface Programador
		pensamento = new String(ideias);
	}
	public String digitando() { // M�todo definido na interface Programador
		return pensamento;
	}
	private String aprendendo() { // M�todo esclusivo desta classe
		return "Java";
	}
}
