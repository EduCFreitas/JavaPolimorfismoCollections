package JavaOO2Interfaces;

public class Principal {

	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum(); // Instanciando
		Leitor leitor = participante; // Upcast para Leitor
		System.out.println("O participante está lendo "+leitor.lendo());
		Programador programador = participante; // Upcast pata Programador
		String java = "Java";
		programador.pensando(java.toCharArray());
		System.out.println("E programando "+programador.digitando());

	}

}
