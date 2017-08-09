package escolapoo;

import java.util.Date;

import escola.Aluno;
import escola.Turma;

public class paraUm {
	
	public static void main(String[] args){
		
		Turma turma1 = new Turma();
		turma1.setSigla("1A");
		turma1.setAno(1);
		
		Turma turma2 = new Turma();
		turma2.setSigla("2A");
		turma2.setAno(3);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jorge");
		aluno1.setMatricula(123);
		aluno1.setDataNascimento(new Date());
		aluno1.setTurma(turma1);
		turma1.adicionarAluno(aluno1);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Joao");
		aluno2.setMatricula(321);
		aluno2.setDataNascimento(new Date());
		aluno2.setTurma(turma1);
		turma1.adicionarAluno(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Rebeca");
		aluno3.setMatricula(665);
		aluno3.setDataNascimento(new Date());
		aluno3.setTurma(turma2);
		turma2.adicionarAluno(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Patricia");
		aluno4.setMatricula(568);
		aluno4.setDataNascimento(new Date());
		aluno4.setTurma(turma2);
		turma2.adicionarAluno(aluno4);
		
		
		System.out.println("Dados do aluno");
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getTurma().getSigla());
		
		System.out.println("--------------------------------");
		
		System.out.println("Alunos da turma1");
		for(int i=0; i < turma1.quantidadeAlunos(); i++){
			System.out.println(turma1.getAluno(i).getNome());
		}
		
		System.out.println("Alunos da turma2");
        for(int i=0; i < turma2.quantidadeAlunos(); i++){
	        System.out.println(turma2.getAluno(i).getNome());
        }
		
		
		
		
	}

}
