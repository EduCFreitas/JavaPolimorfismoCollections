package JavaCollections;

import java.util.*;

public class ListaAlunoMap {

	public static void main(String[] args) {
		// O primeiro refere-se à chave e o segundo ao valor
		Map<String, Aluno> mapa = new TreeMap<String, Aluno>(); // Garante que as chaves estarão em ordem ascendente
		
		Aluno a = new Aluno("Carlos Ferreira", "Java avançado", 0);
		Aluno b = new Aluno("Maria Souza", "Python", 0);
		Aluno c = new Aluno("Carla Silva", "Cloud", 0);
		Aluno d = new Aluno("José Guerreiro", "MySQL", 0);
		
		mapa.put("Carlos Ferreira", a); // Método para inserir na estrutura
		mapa.put("Maria Souza", b);
		mapa.put("Carla Silva", c);
		mapa.put("José Guerreiro", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("José Guerreiro")); // Recupera um valor específico
		
		Collection<Aluno> alunos = mapa.values(); // Retorna um *Collection* com os valores associados às chaves
		
		for(Aluno e:alunos) {
			System.out.println(e);
		}
	}

}
