package JavaOO1ClassesAbstratas;

public class Principal {

	public static void main(String[] args) {
		Fisica pessoa1 = new Fisica("Daniel");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getCPF());
		Juridica pessoa2 = new Juridica();
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getCNPJ());
	}

}
