package escolapoo;

import escola.Disciplina;
import escola.Professor;

public class muitosParaMuitos {
	
public static void main(String[] args){
	
	Disciplina disciplina1 = new Disciplina();
	disciplina1.setNome("Matematica");
	disciplina1.setCargaHoraria(80);
	
	Disciplina disciplina2 = new Disciplina();
	disciplina2.setNome("Portugues");
	disciplina2.setCargaHoraria(80);
	
	Professor professor1 = new Professor();
	professor1.setNome("joão");
	professor1.setMatricula(123);
	professor1.setFormacaoAcademica("Licenciado");
	professor1.setSalario(10);
	
	Professor professor2 = new Professor();
	professor2.setNome("Joaquim");
	professor2.setMatricula(321);
	professor2.setFormacaoAcademica("Licenciado");
	professor2.setSalario(40);
	
	//relação
	professor1.adicionarDisciplina(disciplina1);
	disciplina1.adicionarProfessor(professor1);
	
	professor1.adicionarDisciplina(disciplina2);
	disciplina2.adicionarProfessor(professor1);
	
	professor2.adicionarDisciplina(disciplina2);
	disciplina2.adicionarProfessor(professor2);
	
	//Listar prof 1
	System.out.println("\n\nDisciplinas do professor João");
	for (int i=0; i < professor1.quantidadeDisciplinas(); i++ ){
		Disciplina disciplina = professor1.getDisciplina(i);
		System.out.println(disciplina.getNome());
	}
	
	System.out.println("\n\nListar professores de portuges");
	for(int i=0; i < disciplina2.quantidadeProfessores(); i++ ){
		System.out.println(disciplina2.getProfessor(i).getNome());
	
}


}

}
