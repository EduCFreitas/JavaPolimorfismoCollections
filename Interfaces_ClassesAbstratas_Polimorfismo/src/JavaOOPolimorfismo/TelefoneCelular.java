package JavaOOPolimorfismo;

public class TelefoneCelular extends Telefone {
	public TelefoneCelular() {
		super("Celular");
	}
	
	public void toca(int codigoToque) {
		switch(codigoToque) {
			case 1:
				System.out.println("Roque...");
				break;
			case 2:
				System.out.println("Blim...");
				break;
			default:
				System.out.println("Trim...");
		}
	}
	
	public void disca(String numero) {
		System.out.println("O número: "+numero+" é um celular.");
	}
}
