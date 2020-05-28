package JavaOOPolimorfismo;

public abstract class Telefone {
	private String tipo;
	// Método abstrato para uso em polimorfismo
	abstract public void disca(String numero);
	// Método abstrato para uso em polimorfismo
	abstract public void toca (int numToques);
	
	public Telefone (String tipo) { // Construtor
		this.tipo = tipo;
	}
}
