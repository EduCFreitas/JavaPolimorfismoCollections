package JavaOOPolimorfismo;

public class TelefonePublico extends Telefone{
	public TelefonePublico() {
		super("P�blico");
	}
	
	public void toca(int numToques) {
		for(int i=0; i<numToques; i++) {
			System.out.println("Ring!");
		}
	}
	public void disca(String numero) {
		if(numero.charAt(0)=='9') {
			System.out.println("Este telefone n�o liga para celular.");
		}else {
			System.out.println("Discando: "+numero);
		}
	}
}
